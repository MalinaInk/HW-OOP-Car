package transport;

import java.time.LocalDate;

public class Car extends Transport {
   private double engineVolume;
   private String gear;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    public Car(
            String brand,
            String model,
            int productionYear,
            String productionCountry,
            String color,
            double maxSpeed,
               double engineVolume,
               String gear,
               String typeOfBody,
               String regNumber,
               int seatsCount,
               boolean summerTyres,
               Key key,
               Insurance insurance
    ) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (gear == null || gear.isEmpty()) {
            this.gear = "МКПП";
        } else {
            this.gear = gear;
        }
        if (typeOfBody == null || typeOfBody.isEmpty()) {
            this.typeOfBody = "седан";
        } else {
            this.typeOfBody = typeOfBody;
        }

        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
        this.seatsCount = 5;
        this.summerTyres = true;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               double maxSpeed,
               double engineVolume) {
        this( brand, model, productionYear, productionCountry, color, maxSpeed, engineVolume,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true,
                new Key(),
                new Insurance());
                }

    public void getInfo() {
        System.out.println(getBrand() + " " + getModel() +
                ", сборка в " + getProductionCountry() +
                ", в " + getProductionYear() + " году, "
                + getColor() + " цвет кузова, " + getColor() +
                " объем - " + getEngineVolume() + " л." +
                ", тип двигателя " + getGear() +
                ", тип кузова " + getTypeOfBody() +
                ", регистрационный номер " + getRegNumber() +
                ", количество мест " + getSeatsCount() +
                ", резина " + (isSummerTyres() ? "летняя" : "зимняя") +
                (getKey().isWithoutKeyAccess() ? ", безключевой доступ" : ", ключевой доступ") +
                (getKey().isRemoteRunEngine() ? ", удаленный запуск" : ", обычный запуск") +
                ", номер страховки " + getInsurance().getNumber() +
                ", стоимость страховки " + getInsurance().getCost() +
                ", срок действия страховки " + getInsurance().getExpireDate());
    }

    public void refill() {
        System.out.println("ТС заправлять бензином, дизелем на заправке или на электропарковке.");
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null || gear.isEmpty()) {
            this.gear = "МКПП";
        } else {
            this.gear = gear;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "х000хх000";
        }
        this.regNumber = regNumber;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {

            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            this.cost = cost;

            if (number == null) {
                this.number = "123456789";
            } else {
            this.number = number;
            }
        }

        public Insurance() {
            this(null, 10000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки не корректный!");
            }
        }
    }
}

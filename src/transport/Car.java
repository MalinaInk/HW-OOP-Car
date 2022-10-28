package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gear;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;

    public Car(String brand,
               String model,
               String productionCountry,
               int productionYear,
               String color,
               double engineVolume,
               String gear,
               String typeOfBody,
               String regNumber,
               int seatsCount,
               boolean summerTyres
    ) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
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
    }

    public Car(String brand,
               String model,
               String productionCountry,
               int productionYear,
               String color,
               double engineVolume) {
        this(brand,
                model,
                productionCountry,
                productionYear,
                color,
                engineVolume,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true);
        }

    public void getInfo() {
        System.out.println(getBrand() + " " + getModel() +
                ", сбока в " + getProductionCountry() +
                ", в " + getProductionYear() + " году, "
                + getColor() + " цвет кузова, " + getColor() +
                " объем - " + getEngineVolume() + " л." +
                ", тип двигателя " + getGear() +
                ", тип кузова " + getTypeOfBody() +
                ", регистрационный номер " + getRegNumber() +
                ", количество мест " + getSeatsCount() +
                ", резина " + (isSummerTyres()?"летняя":"зимняя"));
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}

package transport;

public class Train extends Transport {
    private double travelPrice;
    private double travelTime;
    private String departureStation;
    private String endingStation;
    private int numberOfWagons;



    public Train(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, double travelPrice, double travelTime, String departureStation, String endingStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        setTravelPrice(travelPrice);

        if (travelTime == 0) {
            System.out.println(" Время в пути уточняйте в кассах");
        } else if (travelTime < 0) {
            this.travelTime = Math.abs(travelTime);
        } else {
            this.travelTime = travelTime;
        }

        if (departureStation == null || departureStation.isEmpty()) {
            this.departureStation = "не указана";
        } else {
            this.departureStation = departureStation;
        }

        if (endingStation == null || endingStation.isEmpty()) {
            this.endingStation = "не указана";
        } else {
            this.endingStation = endingStation;
        }
        setNumberOfWagons(numberOfWagons);
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() +
                ", выпущен в " + getProductionYear() + " году в стране " +
                getProductionCountry() + ", цвет " + getColor() +
                ", максимальная скорость " + getMaxSpeed() +
                ". Цена билета: " + travelPrice +
                ". Время в пути: " + travelTime +
                ". Начальная станция: " + departureStation +
                ". Конечная станция: " + endingStation +
                ". Количество вагонов: " + numberOfWagons;
    }

    public void refill() {
        System.out.println("ТС заправлять дизелем.");
    }

    public double getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(double travelPrice) {
        if (travelPrice == 0) {
            this.travelPrice = 3000;
        } else if (travelPrice < 0) {
            this.travelPrice = Math.abs(travelPrice);
        } else {
            this.travelPrice = travelPrice;
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons == 0) {
            this.numberOfWagons = 5;
        } else if (numberOfWagons < 0) {
            this.travelPrice = Math.abs(numberOfWagons);
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }
}

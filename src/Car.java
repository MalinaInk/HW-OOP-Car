public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, String productionCountry, int productionYear, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
        this.color = color;
        this.engineVolume = engineVolume;
    }

       void getInfo() {
        System.out.println(brand + model +
                ", сбока в " + productionCountry +
                ", в " + productionYear + " году, "
                + color + " цвет кузова, " +
                "объем - " + engineVolume + " л.");
    }

}

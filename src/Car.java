public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

       void getInfo() {
        System.out.println(brand + model +
                ", сбока в " + productionCountry +
                ", в " + productionYear + " году, "
                + color + " цвет кузова, " +
                "объем - " + engineVolume + " л.");
    }

}

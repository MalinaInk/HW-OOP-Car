package transport;

public class Bus extends  Transport{

    public Bus(String brand, int productionYear, String productionCountry, String color) {
        this (brand, null, productionYear, productionCountry, color, 0);
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("ТС заправлять бензином или дизелем на заправке");
    }

    @Override
    public String toString() {
        return "АВТОБУС: " + super.toString();
    }
}

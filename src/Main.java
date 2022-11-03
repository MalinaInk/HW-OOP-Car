import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(
                "Lada",
                "",
                2015,
                "России",
                "желтый",
                240,
                1.2);
        car1.setGear("автомат");
        car1.setRegNumber("х800vc900");
        car1.getInfo();

        Car car2 = new Car(
                "Audi",
                "A850 L TDI quattro",
                2010,
                null,
                "черный",
                250,
                3.0);
        car2.setRegNumber("х050jх098");
        car2.setSummerTyres(false);
        car2.setKey(new Car.Key(true,true));
        car2.getInfo();


        Car car3 = new Car(
                "BMW",
                "Z8",
                2021,
                "Германии",
                "",
                230,
                3.0);
        car3.setRegNumber("х870хk050");
        car3.setInsurance(new Car.Insurance(LocalDate.now(),30_000,"123456"));
        car3.getInsurance().checkExpireDate();
        car3.getInsurance().checkNumber();
        car3.getInfo();


        Car car4 = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2002,
                "Южной Корее",
                null,
                245,
                2.4);
        car4.setSummerTyres(false);
        car4.getInfo();

        Car car5 = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южной Корее",
                "оранжевый",
                0,
                0,
                "автомат",
                "минивэн",
                null,
                5,
                true,
                new Car.Key(),
                new Car.Insurance());
        car5.getInfo();
    }
}




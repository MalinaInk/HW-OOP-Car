import transport.Bus;
import transport.Car;
import transport.Train;

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
        car1.refill();

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
        car2.refill();

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
        car3.refill();


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
        car4.refill();

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
        car5.refill();

        Train lastochka = new Train(
                "Ласточка", "В-901", 2011, "Россия", null,
                301, 3500, 0,
                "Белорусский вокзал", "Минск пассажирский", 11);
        System.out.println(lastochka.toString());
        lastochka.refill();

        Train leningrad = new Train(
                "Ленинград", "D-125", 2019, "Россия", null,
                270, 1700, 0,
                "Ленинградский вокзал", "Ленинград пассажирский", 8
        );
        System.out.println(leningrad.toString());
        leningrad.refill();

        Bus ankai = new Bus("Ankai", "HFF6100G39C", 2011, "Китай", null, 210);
        System.out.println(ankai.toString());
        ankai.refill();

        Bus isuzu = new Bus("Isuzu", 2010, "Швеция", "белый");
        System.out.println(isuzu.toString());
        isuzu.refill();

        Bus daewoo = new Bus("Daewoo", "BS090", 2015, "Южная Корея", "красный", 200);
        System.out.println(daewoo.toString());
        daewoo.refill();
    }
}




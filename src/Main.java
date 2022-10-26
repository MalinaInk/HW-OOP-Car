import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","","России",2015,"желтый",1.7);
        car1.getInfo();

        Car car2 = new Car("Audi", "A850 L TDI quattro","",2020,"черный", 3.0);
        car2.getInfo();

        Car car3 = new Car("BMW","Z8","Германии",2021,"",3.0);
        car3.getInfo();

        Car car4 = new Car("Kia","Sportage 4-го поколения","Южной Корее",0,"красный",2.4);
        car4.getInfo();

        Car car5 = new Car("Hyundai","Avante","Южной Корее", 2016,"оранжевый",0);
        car2.getInfo();
    }
}




package week03.packageExample.main;

import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();

        car1.horn();
        car2.horn();
    }
}



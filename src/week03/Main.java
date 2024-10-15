package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        //메서드 호출 및 반환값 저장

        double speed1 = car.gasPedal(100, 'D');
        System.out.println("gear = " + car.gear);
        System.out.println("speed = " + speed1);

        System.out.println(car.light);
        car.onOffLights();
        System.out.println(car.light);

        System.out.println();

        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(100, 110, 90);
    }
}

package week03.abstractSample;

public abstract class Car {
    double speed;  // 자동차 속도 , km/h

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public abstract void horn();
}

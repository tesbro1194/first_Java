package week03.constructor;

public class Car {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태


    // 오버로딩 , Car라는 class는 아래 세 가지 방법으로 객체화시킬 수 있다.
// 생성자 1
    public Car(String modelName) {
        model = modelName;
        System.out.println("첫 번째 생성자가 호출되었습니다.");
    }

    // 생성자 2
    public Car(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        System.out.println("두 번째 생성자가 호출되었습니다.");
    }

    // 생성자 3
    public Car(String modelName, String colorName, double priceValue) {
        model = modelName;
        color = colorName;
        price = priceValue;
        System.out.println("세 번째 생성자가 호출되었습니다.");
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }
}

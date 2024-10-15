package week03;

//      클래스를 만드는 방법.
//    1. 클래서 선언: 만드려고 하는 설계도를 선언
//    2. 객체가 가지고 있어야할 속성(필드)을 정의
//    3. 생성자 : 객체를 생성하는 방식을 정의(생성자, constructor)
//    4. 메서드 : 객체가 가지고 있어야할 행위(메서드)를 정의


// 1. 클래스 선언
public class Car {

    // 2. 필드 영역, 객체의 속성(필드) 정의 , 필드를 변수 형태로 넣는다. 메서드를 통해 제어 가능.
    // 2-1_ 고유 데이터 영역
    String company;
    String model = "GV80";  // class Car를 통해 객체를 만들 때 항상 적용.
    String color;
    double price;

    // 2-2) 상태 데이터 영역
    double speed;
    char gear;
    boolean light = true;  // class Car를 통해 객체를 만들 때 항상 적용.

    // 2-3) 객체 데이터 영역, java에서 제공하지 않는 class를 만들어서 가져온 것.
    Tire tire = new Tire(); // Tire 클래스를 갖는 데이터 tire가 new명령어를 통해 인스턴스화 된다. 이로서 tire를 객체로서 활용 가능.
    Door door;
    Handle handle;



    // 3. 생성자 영역, 처음 객체가 생성될 때(instnace화) 어떤 값이 들어와야 하며 어떤 로직을 수행하는지 정의
    // 메서드를 넣은 필드들을 처음에 어떻게 정의할 것인가를 결정. 클래스명과 동일하게 가져가야 한다.
    public Car () {
        System.out.println("생성자가 호출되었습니다. 객체가 생성되었습니다.");
    } // (): input, {}: logic , input과 logic이 없는 형태를 기본생성자라고 하며 생략 가능



    // 4. 메서드(행위) 영역,
//    gasPedal , input : kmh , output : speed
    double gasPedal(double kmh, char type){
        changeGear(type); // 가스페달을 밟으면 기어가 변한다.
        speed = kmh;
        return speed;
    }
//    brakePedal, input : , output : speed
    double brakePedal(){
        speed = 0;
        return speed;
    }
//    changeGear, input : gear(char type) , output : gear
    char changeGear(char type){
        gear = type;
        return gear;
    }
//    onOffLight, input : , output : lights(boolean)
    boolean onOffLights(){
        light=!light;
        return light;
    }
//    horn, input : , output : speed
    void horn(){
        System.out.println("빠~앙");
    }

    // 자동차의 속도 .. 가변 길이 메서드
    void carSpeeds(double ... speeds) {
        for(double spds : speeds){
            System.out.println("속도 = " + spds);
        }
    }
}

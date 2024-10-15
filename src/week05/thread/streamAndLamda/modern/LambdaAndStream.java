package week05.thread.streamAndLamda.modern;

import java.util.ArrayList;
import java.util.List;

// 주차장 예제, 티켓 또는 주차 요금가 있어야 주차할 수 있음.

public class LambdaAndStream {
    public static void main(String[] args) {

        // 주차를 원하는 차량 리스트
        ArrayList<Car> carsWantToPark = new ArrayList<>();
        // 주차장에 들어간 차량 리스트
        ArrayList<Car> parkingLot = new ArrayList<>();
        // 주말 주차장
        ArrayList<Car> weekendParkingLot = new ArrayList<>();

        // 5개의 Car 객체
        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

//  메서드의 매개변수에 함수를 넣고 싶은데 어떻게 해야할까? 인터페이스를 만들어서 ! 맨 아래 있음
//    public exampleMethod (int parameter1, 함수 parameterfuction) {
//        parameterfuction 사용
//    }

//        parkingLot.addAll(parkingCarWithTicket(carsWantToPark));  // 티켓이 있는 차량을 주차장에 넣음
        parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket));  // parkCars( , ) List carsWantToPark 와 Car 안의 함수를 매개변수로 넣어 parkCars 메서드를 호출하고 리턴값 cars를 addAll 함

//        parkingLot.addAll(parkingCarWithMoney(carsWantToPark));  //  주차 요금이 있는 차량을 주차장에 넣음
        parkingLot.addAll(parkCars(carsWantToPark, Car::hasMoney));

//       주말 주차장에 들어갈 차량 추가하기. 람다식 사용 ` () -> {} : (매개 변수, 없을 때 빈 공간 가능) -> {구현 부분}
//       람다식에서 return 값과 함수가 같을 때 {}도 생략 가능하다. {return car.hasParkingTicket() && (car.getParkingMoney() > 1000);} 와 car.hasParkingTicket() && (car.getParkingMoney() > 1000) 는 같다.
        weekendParkingLot.addAll(parkCars(carsWantToPark, (Car car) -> car.hasParkingTicket() && (car.getParkingMoney() > 1000) ));


        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }
    }

//    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) { // 티켓이 없지만 돈이 1000원 초과로 있는
//                cars.add(car);
//            }
//        }
//        return cars;
//    }
//
//    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (car.hasParkingTicket()) {
//                cars.add(car);
//            }
//        }
//        return cars;
//    }


    // 위 두 메서드-parkingCarWithTicket, parkingCarWithMoney-를 하나로 만들자. 내부 주요 로직을 함수로 전달 받는다.

    public static List<Car> parkCars (List<Car> carsWantToPark, Predicate<Car> function) {
        List<Car> cars = new ArrayList<>();  // 이곳에 값을 담에서 리턴.

        for (Car car : carsWantToPark) {  // 전달된 함수를 사용하여 구현
            if (function.test(car)) {
                cars.add(car);
            }
        }
        return cars;
    }
}






class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    public static boolean hasTicket (Car car){
        return car.hasParkingTicket();
    }
    public static boolean hasMoney (Car car) {
        return !car.hasParkingTicket() && (car.getParkingMoney() > 1000);
    }
}

// 함수를 매개변수로 받기 위해서 인터페이스를 만든다. 이때 만들어지는 것이 함수형 인터페이스.
// 인터페이스는 타입 역할을 할 수 있기 때문
// 함수형 인터페이스 :  추상 메서드를 딱 하나만 가지고 있다.

interface Predicate<T> {
    boolean test(T t); // 메서드.
}
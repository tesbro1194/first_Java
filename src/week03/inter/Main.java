package week03.inter;

public class Main {
    public static void main(String[] args) {

        // LG TV 구현체를 조작
        // 자동 형 변환
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();

        // 조작 대상을 Samsung TV로 교체, 형변환
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();

        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");

        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();

        // samsung MultiRemoteController 타입이었는데 SamsungTv 타입으로 강제 형변환.
        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();


        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();

        // lg는 MultiRemoteController 타입이었는데 LgTv 타입으로 강제 형변환.
        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}

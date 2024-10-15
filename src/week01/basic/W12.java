package week02.W01;

public class W12 {
    public static void main(String[] args) {
        boolean flag = false;
        int number = 2;

        if (flag) {
            if (number == 1) {
                System.out.println("flag값은 true고 number값은 1입니다");
            } else if (number == 2) {
                System.out.println("flag값은 true고 number값은 2입니다");
            } else {
                System.out.println("flag값은 true고 number값은 모릅니다");
            }
        } else{
            if (number == 1) {
                System.out.println("flag값은 false고 number값은 1입니다");
            } else if (number == 2) {
                System.out.println("flag값은 false고 number값은 2입니다");
            } else {
                System.out.println("flag값은 false고 number값은 모릅니다");
            }
        }
    }
}

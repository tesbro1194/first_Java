package week02.W01;

public class W15 {
    public static void main(String[] args) {
        int[] numbers = {4,8,12,16, 20};
        for(int number: numbers) {
            if (number == 12){
                continue;
            }
            System.out.println(number);
        }
    }
}

package week02.W01.Array;

public class arr07 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int min = arr[0];
        for(int i : arr){
            if(min > i){
                min = i;
            }
        }
        System.out.println(min);
    }
}

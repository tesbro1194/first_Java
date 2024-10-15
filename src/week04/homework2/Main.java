package week04.homework2;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        if (!calculateEnded) {
            try {
                CalculatorApp.start();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("anjrh");
            }
        }

    }
}


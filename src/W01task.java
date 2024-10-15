import java.util.Scanner;

public class W01task {
    public static void main(String[] args) {

    Scanner inputTitle = new Scanner(System.in);
    System.out.println("요리 제목을 입력하세요: ");
    String title = inputTitle.nextLine();

    Scanner inputRecord = new Scanner(System.in);
    System.out.println("요리 점수를 1~5점 입력하세요: ");
    double record = inputRecord.nextDouble();
    double perRecord = (int) record*20;


    System.out.println("1. 레시피를 입력하세요");
    Scanner recipe1 = new Scanner(System.in);
    String reCipe1 = recipe1.nextLine();

    System.out.println("2. 레시피를 입력하세요");
    Scanner recipe2 = new Scanner(System.in);
    String reCipe2 = recipe2.nextLine();

    System.out.println("3. 레시피를 입력하세요");
    Scanner recipe3 = new Scanner(System.in);
    String reCipe3 = recipe3.nextLine();

    System.out.println("4. 레시피를 입력하세요");
    Scanner recipe4 = new Scanner(System.in);
    String reCipe4 = recipe4.nextLine();

    System.out.println("5 .레시피를 입력하세요");
    Scanner recipe5 = new Scanner(System.in);
    String reCipe5 = recipe5.nextLine();

    System.out.println("6. 레시피를 입력하세요");
    Scanner recipe6 = new Scanner(System.in);
    String reCipe6 = recipe6.nextLine();

    System.out.println("7. 레시피를 입력하세요");
    Scanner recipe7 = new Scanner(System.in);
    String reCipe7 = recipe7.nextLine();

    System.out.println("8. 레시피를 입력하세요");
    Scanner recipe8 = new Scanner(System.in);
    String reCipe8 = recipe8.nextLine();

    System.out.println("9. 레시피를 입력하세요");
    Scanner recipe9 = new Scanner(System.in);
    String reCipe9 = recipe9.nextLine();

    System.out.println("10. 레시피를 입력하세요");
    Scanner recipe10 = new Scanner(System.in);
    String reCipe10 = recipe10.nextLine();

    System.out.println("입력을 마쳤으면 끝을 입력하세요: ");
    Scanner inputEnd = new Scanner(System.in);
    String endName = inputEnd.nextLine();


    System.out.println("[" + title + "]");
    System.out.println("별점: " + record + "(" + perRecord + "%" + ")");
    System.out.println("1. " + reCipe1);
    System.out.println("2. " + reCipe2);
    System.out.println("3. " + reCipe3);
    System.out.println("4. " + reCipe4);
    System.out.println("5. " + reCipe5);
    System.out.println("6. " + reCipe6);
    System.out.println("7. " + reCipe7);
    System.out.println("8. " + reCipe8);
    System.out.println("9. " + reCipe9);
    System.out.println("10. " + reCipe10);

    System.out.println(endName);

    }
}


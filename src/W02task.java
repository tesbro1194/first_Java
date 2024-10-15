
import java.util.ArrayList;
import java.util.Scanner;

public class W02task {
    public static void main(String[] args) {
        Scanner inputColName = new Scanner(System.in);
        System.out.println("저장할 자료구조명을 입력하세요: ");
        String colName = inputColName.nextLine();

        Scanner inputTitle = new Scanner(System.in);
        System.out.println("요리 제목을 입력하세요: ");
        String title = inputTitle.nextLine();

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

        ArrayList<String> strArrayRecipe = new ArrayList<String>();
        strArrayRecipe.add(reCipe1);
        strArrayRecipe.add(reCipe2);
        strArrayRecipe.add(reCipe3);
        strArrayRecipe.add(reCipe4);
        strArrayRecipe.add(reCipe5);
        strArrayRecipe.add(reCipe6);
        strArrayRecipe.add(reCipe7);
        strArrayRecipe.add(reCipe8);
        strArrayRecipe.add(reCipe9);
        strArrayRecipe.add(reCipe10);
        strArrayRecipe.add(endName);

        System.out.println("[ " + colName + " 으로 저장된 " + title + " ]");
        for (int j=0; j<strArrayRecipe.size(); j++){
            System.out.println((j+1) + ". " + strArrayRecipe.get(j));
            if (j == (strArrayRecipe.size() -2 )){
                break;
            }
        }
    }
}

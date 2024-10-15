package week02.W01.Array;

public class arr05 {
    public static void main(String[] args) {
        // String 기능 활용 예시
        // 1) length
        String str = "ABCD";
        int strLength = str.length();
        System.out.println(strLength);
        // 2) charAt(int index)
        char strChar = str.charAt(2);
        System.out.println(strChar);
        // 3) substring (int fromInx, int toInx)
        String subStr = str.substring(0,2);
        System.out.println(subStr);
        // 4) equals(String str) boolean형
        String newStr = "ABCC";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);
        // 5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray[1]);
        // 6) char[] -> String
        char[] charArray = {'A', 'B','C','D'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}

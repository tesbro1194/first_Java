package week05.thread.NullHandling;

public class OccurProblem {
    public static void main(String[] args) {

        SomeDBClient myDB = new SomeDBClient();

        String userId = myDB.findUserIdByUsername("HelloWorldMan");

        System.out.println("HelloWorldMan's user Id is : " + userId);
    }
}

//String userId = myDB.findUserIdByUsernameOrThrowNull("HelloWorldMan");
//// 개선 1: null이 반환 될 수 있음을 인지한 메서드 사용자는, null을 대비합니다.
//        if (userId != null) {
//        System.out.println("HelloWorldMan's user Id is : " + userId);
//        }

class SomeDBClient {

    public String findUserIdByUsername(String username) {
        // ... db에서 찾아오는 로직
        String data = "DB Connection Result";

        if (data != null) {
            return data;
        } else {
            return null;
        }
    }

}


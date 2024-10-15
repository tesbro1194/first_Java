package week05.thread.NullHandling;

public class Solution2 {
}

class SomeObjectForNullableReturn {
    private final String returnValue;
    private final Boolean isSuccess;

    SomeObjectForNullableReturn(String returnValue, Boolean isSuccess) {
        this.returnValue = returnValue;
        this.isSuccess = isSuccess;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public Boolean isSuccess() {
        return isSuccess;
    }
}

class NullIsDanger {
    public static void main(String[] args) {

        SomeDBClients myDB = new SomeDBClients();

        // 개선 2 : 이제 해당 메서드를 사용하는 유저는, 객체를 리턴받기 때문에 더 자연스럽게 성공여부를 체크하게 됩니다.
        SomeObjectForNullableReturn getData = myDB.findUserIdByUsername("HelloWorldMan");

        if (getData.isSuccess()) {
            System.out.println("HelloWorldMan's user Id is : " + getData.getReturnValue());
        }
    }
}

class SomeDBClients {
    // 개선 2 : 결과값을 감싼 객체를 리턴합니다.
    public SomeObjectForNullableReturn findUserIdByUsername(String username) { // ... DB에서 찾아오는 로직
        String data = "DB Connection Result";
        if (data != null) {
            return new SomeObjectForNullableReturn(data, true);
        } else {
            return new SomeObjectForNullableReturn(null, false);
        }
    }
}
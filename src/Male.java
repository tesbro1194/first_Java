import javax.naming.Name;

public class Male implements Animal {
    String name;
    // 오버라이딩
    @Override
    public void showName() {
        System.out.println("네 이름부터 밝혀라, 애송이\n");
    }
    // 오버로딩
    public void showName(String yourName) {
        System.out.printf("처음 뵙겠습니다, %s님. 저는 %s라고 합니다\n", yourName, name);
    }
}

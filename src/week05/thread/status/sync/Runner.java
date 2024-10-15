package week05.thread.status.sync;

public class Runner {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();
        AppleStore appleStore1 = new AppleStore();

        appleStore1.eatApple();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
                appleStore.eatApple();
            }

        };
        // for문을 통해 3개의 thread를 생성(New)과 동시에 start(Runnable).
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }


// 해당 객체의 참조변수(객체를 참조하고 있는 변수)
    public void eatApple() {
        synchronized (this) {
            if (storedApple > 0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}
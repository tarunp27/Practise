//extends thread
public class ThreadExmp1 {
    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        t2.start();
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 5);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

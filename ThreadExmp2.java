public class ThreadExmp2 {
    public static void main(String[] args) {

        // anonymous class
        Runnable aThread = new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i * 2);
                }
            }
        };

        Thread t1 = new Thread(aThread);
        t1.start();

        // lamda expression

        Runnable r = () -> {
            System.out.println("This  is  Lamda Expression");
        };
        Thread h = new Thread(r);
        h.start();
    }
    // The difference is that Thread.start() starts a thread that the call the run()
    // method, while Runnable.run() juts calls the run() method on the current
    // thread
}

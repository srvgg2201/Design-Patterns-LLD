package Singleton;

public class Client {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(DBConnection.getInstance());
            }
        });

        Thread t2 = new Thread(() -> System.out.println(DBConnection.getInstance()));

        t1.start();
        t2.start();
    }
}

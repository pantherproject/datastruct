package voli;

/**
 * volatile
 * Created by panther on 17-5-2.
 */
public final class VolatileExample extends Thread {
    private static boolean flag = false;


    public void run() {
        while (!flag) {
            System.out.println("test");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new VolatileExample().start();

        Thread.sleep(100);

        flag = true;
    }
}

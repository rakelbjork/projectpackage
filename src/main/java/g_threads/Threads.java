package g_threads;

class myThread implements Runnable {
    @Override
    public void run() {

    }
}

public class Threads extends myThread {

    public static void main(String[] args) {

        int start1 = 0;
        int end1 = 349999;
        int start2 = 350000;
        int end2 = 500000;

        Thread thread = new Thread(() -> {
            try {
                for (int i = start1; i <= end1; i++) {
                    if (primeCheck(i)) {
                        System.out.println(i);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        thread.start();

        Thread thread2 = new Thread(() -> {
            for (int i = start2; i <= end2; i++) {
                if (primeCheck(i)) {
                    System.out.println(i);
                }
            }
        });
        thread2.start();
    }
    public static boolean primeCheck(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

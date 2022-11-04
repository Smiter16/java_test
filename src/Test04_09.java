public class Test04_09 extends Thread {
    Thread thread1 = new Thread();
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                thread1.sleep(500);
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}

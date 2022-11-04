public class Test04_09_App {
    public static void main(String[] args) {
        Test04_09 test04_09 = new Test04_09();
        Thread thread2 = new Thread();
        thread2.setDaemon(true);
        thread2.start();

        try {
            for (int i = 0; i < 5; i++) {
                thread2.sleep(500);
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

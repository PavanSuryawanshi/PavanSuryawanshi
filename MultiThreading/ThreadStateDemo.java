import java.io.IOException;

class ThreadStateDemo implements Runnable{
    private static String name;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"is running");

        try{
            System.out.println(Thread.currentThread().getName()+"is in waiting State");
            Thread.sleep(5000);

            Object lock = null;
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+"is entering waiting State");
                lock.wait();
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"is exiting waiting State");
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Thread t1 = new Thread(new ThreadStateDemo());

        System.out.println(Thread.currentThread().getName()+"is in New State");
        t1.start();

        Thread.sleep(5000);

        String blokerThread1 = "BlokerThread";
        String blokerThread = blokerThread1;
        String blokerThread11 = blokerThread1;
        String blokerThread12 = blokerThread1;
        Thread t2 = new Thread(()->{
            synchronized (t1){
                try{

                System.out.println(Thread.currentThread().getName()+"is entering waiting State");
                Thread.sleep(4000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }, name:blokerThread1);
        ProcessBuilder bloker;
        bloker.start();
    }

}

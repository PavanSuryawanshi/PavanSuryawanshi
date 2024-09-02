
class DatabaseQuery extends Thread {
    private String query;

    public DatabaseQuery(String query) {
        this.query = query;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + query);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException ie){
            System.out.println(Thread.currentThread().getName() + ": " + "was interrupted");
        }
        System.out.println(Thread.currentThread().getName() + ": " + query);
    }

}

public class ThreadUseCase_FinalExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": " + "is executing our program");

        Thread queryThread1 = new Thread(new DatabaseQuery("SELECT * FROM users"));
        Thread queryThread2 = new Thread(new DatabaseQuery("SELECT * FROM Order"));
        Thread queryThread3 = new Thread(new DatabaseQuery("SELECT * FROM Product"));

        queryThread1.setName("Query Thread 1");
        queryThread2.setName("Query Thread 2");
        queryThread3.setName("Query Thread 3");

        queryThread3.setPriority(Thread.MIN_PRIORITY);
        queryThread2.setPriority(Thread.MAX_PRIORITY);
        queryThread1.setPriority(Thread.NORM_PRIORITY);

        try{
            queryThread1.start();
            queryThread1.join();
            queryThread2.start();
            queryThread2.join();
            queryThread3.start();
            queryThread3.join();
        }catch (InterruptedException ie){
            System.out.println(Thread.currentThread().getName() + ": " + "was interrupted");
        }
        System.out.println("All queries executed successfully");
    }
}

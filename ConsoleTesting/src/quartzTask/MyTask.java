package quartzTask;

public class MyTask 
{	 
    /**
     * It should handle any runtime exception if the application should continue
     * when encounters a exception, otherwise the application will stop
     */
    public void perform() {
        System.out.println("\tMyTask performed by thread: " + Thread.currentThread().getName());
    }
}
package quartzTask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {
    private static final int PERIOD_MS = 2000; // long delay // is ka matlab ha ka dosri dafa class call kara ga to 
                                                // is time pa call kara ga
    private static final int DELAY_MS = 1000;  // long period  // ya first time call karna ka lia itna time laga
 
    public static void main(String[] args) {
        System.out.println(" TimerSchedulerApp main thread: " + Thread.currentThread().getName());
 
        TimerTask task = new TimerJob();
 
        Timer timer = new Timer();
        timer.schedule(task, DELAY_MS, PERIOD_MS);   // task is lia likha ha ka ya is class ko call karata raeh har thori dair ma
        System.out.println("aaa");
    }
}
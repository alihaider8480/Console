package quartzTask;

import java.time.LocalDateTime;
import java.util.TimerTask;

public class TimerJob extends TimerTask {
	 
    @Override
    public void run() {
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println("Run TimerJob at " + localTime.toString());
 
        MyTask task = new MyTask();
        task.perform();
 
    }
}
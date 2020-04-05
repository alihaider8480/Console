package quartzTask;

import java.util.Timer;

public class AliMainClass 
{
	public static void main(String[] args) 
	{
       System.out.println("Starting...");
       
       AliTimer at = new AliTimer();
       
       Timer t = new Timer();
       t.schedule(at, 2000, 2000);
       System.out.println("Enfing...");
	}
}

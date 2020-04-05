package quartzTask;

import java.util.TimerTask;

public class AliTimer extends TimerTask  // is na TimerTask ko implement is lia kia ha kio ka  timer
{                                       // class ka jo method ha schedule us ma timertask ka he object 
	@Override                            // lata ha is lia isko impleent kia ha agar ni karo ga to mujha
	public void run()                    // mujha TimerTask t = new  AliTimer(); karna para ga
	{
		int i = 0;
	     while(true)
	     {
			System.out.println(i);
			i++;
		 }
	     
	     
	}

}                              // jab ma isko extends karo ga to phir iska andar aik run method hota
                               // ha usko andar code likha do ga to ya bar bar run ethod ko call kara ga

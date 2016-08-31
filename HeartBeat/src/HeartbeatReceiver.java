/**
 * 
 */

/**
 * @author Silva & Pavithra
 *
 */
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

import com.sun.jmx.snmp.Timestamp;


public class HeartbeatReceiver
{
	int checkingInterval;
	int checkingTime;
	int expireTime;
	int lastUpdatedTime;
	
	public boolean checkAlive;
	
	public HeartbeatReceiver()
	{
		this.checkingInterval = 5000; // 1 second
		this.expireTime = 10000;
	}
	
	public HeartbeatReceiver( int checkingInterval, int expireTime)
	{
		this.checkingInterval = checkingInterval; // 1 second
		this.expireTime = expireTime;
	}
	
	//cjanged from a bool function to void
	public void checkAlive()
	{
		//boolean isAlive = true;
		this.checkingTime = Integer.parseInt(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp()));
		if (this.checkingTime - this.lastUpdatedTime >= this.expireTime)
		{
			FaultMonitor FM = new FaultMonitor();
			FM.echo();
			
		}
		else
			System.out.println("HeartBeat");
			checkAlive();
		/*
		while (isAlive) {
			   //do something
			  try {
				Thread.sleep(checkingInterval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		/*
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			int cT = checkingTime;
			int eT = expireTime;
		    @Override
		    public void run() {
		    	this.cT = Integer.parseInt(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp()));
		    	if (cT - cT >= eT)
		    	{
		    	isAlive = False;
		    	}
		    }
		}, 0, this.checkingInterval);
		*/
		/*ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		          System.out.println("This will run every 5 seconds");
		      }
		  };
		  new javax.swing.Timer(delay, taskPerformer).start();
		  */
		
		
	}
	
	public boolean pitAPat()
	{
		//add code
		this.updateTime();
		return true;
	}
	
	public int updateTime()
	{
		this.lastUpdatedTime = Integer.parseInt(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp()));
		return this.lastUpdatedTime;
	}
	
	public static void main (String args[])
	{
		
		//boolean isAlive;
		//isAlive = checkAlive();
	}
}

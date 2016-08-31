/**
 * 
 */

/**
 * @author Silva & Pavithra
 *
 */
 import java.util.Timer;
import java.util.*;
//import java.text.SimpleDateFormat;
//import com.sun.jmx.snmp.Timestamp;

public class HeartbeatSender {
	int sendingInterval;
	//
	public HeartbeatSender()
	{
		this.sendingInterval = 5000; // 1 second
	}
	//
	public HeartbeatSender (int sendingInterval)
	{
		this.sendingInterval = sendingInterval;
	}
	
	public void sendMessage ()
	{
		//String time1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp());
		
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
			    @Override
			    public void run() {
			    	HeartbeatReceiver HBR = new HeartbeatReceiver();
			    	HBR.pitAPat();
			    }
			}, 0, this.sendingInterval);
	}
}

/**
 * 
 */

/**
 * @author silva
 *
 */
public class Main {

	public static void main(String args[])
	{
		HeartbeatSender HBS = new HeartbeatSender();
		HeartbeatReceiver HBR  = new HeartbeatReceiver();
		
		HBS.sendMessage();
		HBR.checkAlive();
	}
}

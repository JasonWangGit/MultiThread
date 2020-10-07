package SynchronizeThread;

// use threads to sell 100 tickets
// synchronized by synchronized
public class RunnableBySynchonized implements Runnable {
	private int ticketNumber = 100;
	private Object object = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (object) {
				if(ticketNumber > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " is selling tickets, current ticket no." + ticketNumber);
					ticketNumber--;
				} else {
					break;
				}
			}
		}	
	}
}

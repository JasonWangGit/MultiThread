package SynchronizeThread;

// use threads to sell 100 tickets
public class ImplementsRunnable implements Runnable {
	private int ticketNumber = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
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

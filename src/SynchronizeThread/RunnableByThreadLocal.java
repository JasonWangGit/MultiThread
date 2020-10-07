package SynchronizeThread;

// each thread to sell 10 tickets
public class RunnableByThreadLocal implements Runnable {
	private ThreadLocal<Integer> ticketNumber = new ThreadLocal<Integer>(){
		protected Integer initialValue() {
			return 10;
		};
	};
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticketNumber.get() > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " is selling tickets, current ticket no." + ticketNumber.get());
				ticketNumber.set(ticketNumber.get() - 1);
			} else {
				break;
			}
		}	
	}
}

package SynchronizeThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// use threads to sell 100 tickets
// synchronized by ReenreantLock
public class RunnableByReenreantLock implements Runnable {
	private int ticketNumber = 100;
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			lock.lock();
			try {
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
			} finally {
				// TODO: handle finally clause
				lock.unlock();
			}
		}	
	}
}

package DeadLock;

import java.util.concurrent.Callable;

// deadlock by a static order
public class RunnableByStaticOrder implements Callable<Integer>{
	private Object firstLock = new Object();
	private Object secondLock = new Object();
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		forward();
		backward();
		return 0;
	}
	
	private void forward() {
		synchronized (firstLock) {
			System.out.println("Forward method of " + Thread.currentThread().getName() + " has gotten first lock, waiting second lock.");
			synchronized (secondLock) {
				System.out.println("Forward method of " + Thread.currentThread().getName() + " has gotten first and second lock.");
			}
		}
	}
	
	private void backward() {
		synchronized (secondLock) {
			System.out.println("Backward method of " + Thread.currentThread().getName() + " has gotten second lock, waiting first lock.");
			synchronized (firstLock) {
				System.out.println("Backward method of " + Thread.currentThread().getName() + " has gotten first and second lock.");
			}
		}
	}
}

package CreateThread;
//Second method to create a thread: extends Runnable interface
public class ImplementsRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running " + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}
}

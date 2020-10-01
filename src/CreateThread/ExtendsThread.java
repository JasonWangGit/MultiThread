package CreateThread;
// First method to create a thread: extends Tread class
public class ExtendsThread extends Thread {
	public ExtendsThread() {
		// TODO Auto-generated constructor stub
	}
	
	public ExtendsThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
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

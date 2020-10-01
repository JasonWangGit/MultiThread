package DaemonThread;

public class DaemonThread extends Thread {
	public DaemonThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running " + Thread.currentThread().getName() + ": current task " + i + ".");
		}
		
	}
	
}

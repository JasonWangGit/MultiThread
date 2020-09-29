package JoinMethod;

import CreateThread.ExtendsThread;

public class TestJoinMethod {
	public static void main(String[] args) throws InterruptedException {
		// testJoin();
		testJoinWithArgs(5000);
	}
	
	public static void testJoin() throws InterruptedException {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 5) {
				ExtendsThread firstThread = new ExtendsThread();
				ExtendsThread secondThread = new ExtendsThread();
				firstThread.start();
				firstThread.join();
				secondThread.start();
			}
			System.out.println("Running Thread-" + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}
	
	public static void testJoinWithArgs(int time) throws InterruptedException {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 5) {
				ExtendsThread firstThread = new ExtendsThread();
				ExtendsThread secondThread = new ExtendsThread();
				firstThread.start();
				firstThread.join(time);
				secondThread.start();
			}
			System.out.println("Running Thread-" + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}
}

package ControlThread;

import CreateThread.ExtendsThread;
import CreateThread.ImplementsRunnable;

public class TestSetPriorityMethod {
	public static void main(String[] args) {
		ImplementsRunnable runnableThread = new ImplementsRunnable();
		Thread firstThread = new Thread(runnableThread, "First Thread");
		firstThread.start();
		firstThread.setPriority(Thread.MIN_PRIORITY);
		
		Thread secondThread = new ExtendsThread("Second Thread");
		secondThread.start();
		secondThread.setPriority(Thread.MAX_PRIORITY);
		
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

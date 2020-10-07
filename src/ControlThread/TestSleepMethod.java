package ControlThread;

import CreateThread.ImplementsRunnable;

public class TestSleepMethod {
	public static void main(String[] args) throws InterruptedException {
		ImplementsRunnable runnableThread = new ImplementsRunnable();
		Thread firstThread = new Thread(runnableThread, "First Thread");
		firstThread.start();
		
		Thread.sleep(5000);
		
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

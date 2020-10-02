package ControlThread;

import java.util.concurrent.FutureTask;

import CreateThread.ExtendsThread;
import CreateThread.ImplementsCallable;

public class TestYieldMethod {
	public static void main(String[] args) {
		ImplementsCallable callableThread = new ImplementsCallable();
		FutureTask<Integer> futureTask = new FutureTask<>(callableThread);
		Thread firstThread = new Thread(futureTask, "First Thread");
		firstThread.start();
		
		Thread secondThread = new ExtendsThread("Second Thread");
		secondThread.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i % 2 == 0) {
				Thread.yield();
			}
			System.out.println("Running " + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}
}

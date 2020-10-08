package DeadLock;

import java.util.concurrent.FutureTask;

public class TestStaticOrder {
	public static void main(String[] args) {
		RunnableByStaticOrder runnable = new RunnableByStaticOrder();
		FutureTask<Integer> firstTask = new FutureTask<>(runnable);
		FutureTask<Integer> secondTask = new FutureTask<>(runnable);
		Thread firstThread = new Thread(firstTask, "First Thread");
		Thread secondThread = new Thread(secondTask, "Second Thread");
		firstThread.start();
		secondThread.start();
	}
}

package SynchronizeThread;

public class TestThreadLocal {
	public static void main(String[] args) {
		RunnableByThreadLocal runnable = new RunnableByThreadLocal();
		Thread firstThread = new Thread(runnable, "First Thread");
		Thread secondThread = new Thread(runnable, "Second Thread");
		Thread thirdThread = new Thread(runnable, "Third Thread");
		Thread fourthThread = new Thread(runnable, "Fourth Thread");
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();
		fourthThread.start();
	}
}

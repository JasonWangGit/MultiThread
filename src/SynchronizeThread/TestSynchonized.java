package SynchronizeThread;

public class TestSynchonized {
	public static void main(String[] args) {
		RunnableBySynchonized runnable = new RunnableBySynchonized();
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

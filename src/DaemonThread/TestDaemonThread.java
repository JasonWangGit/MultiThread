package DaemonThread;

import CreateThread.ExtendsThread;

public class TestDaemonThread {
	public static void main(String[] args) throws InterruptedException {
		DaemonThread daemonThread = new DaemonThread("Daemon Thread");
		daemonThread.setDaemon(true);
		daemonThread.start();
		
		Thread.sleep(5000); // To force the main thread sleep 5 seconds
		System.out.println("Main thread has executed!");
		
		ExtendsThread foregroundThread = new ExtendsThread("Foreground Thread");
		foregroundThread.start();
	}
}

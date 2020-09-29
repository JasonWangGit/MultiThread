package CreateThread;

import java.util.concurrent.FutureTask;

public class TestCreateThread {
	public static void main(String[] args) {
		// testExtendsTread();
		// testImplementsRunnable();
		// testImplementsCallable();
		testSimpleRunnable();
	}
	
	public static void testExtendsTread() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 5) {
				ExtendsThread firstThread = new ExtendsThread();
				firstThread.start();
				new ExtendsThread().start();
			}
			System.out.println("Running Thread-" + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}
	
	public static void testImplementsRunnable() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 5) {
				ImplementsRunnable firstRunnableThread = new ImplementsRunnable();
				Thread firstThread = new Thread(firstRunnableThread, "First Thread");
				firstThread.start();
				new Thread(firstRunnableThread).start();
			}
			System.out.println("Running Thread-" + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}

	public static void testImplementsCallable() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 5) {
				ImplementsCallable firstCallableThread = new ImplementsCallable();
				FutureTask<Integer> firstFutureTask = new FutureTask<>(firstCallableThread);
				FutureTask<Integer> secondFutureTask = new FutureTask<>(firstCallableThread);
				Thread firstThread = new Thread(firstFutureTask, "First Thread");
				firstThread.start();
				new Thread(secondFutureTask, "Second Thread").start();
			}
			System.out.println("Running Thread-" + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}
	
	public static void testSimpleRunnable() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 5) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
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
				}, "First Thread").start();;
				
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
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
				}, "Second Thread").start();;
			}
			System.out.println("Running Thread-" + Thread.currentThread().getName() + ": current task " + i + ".");
		}
	}
}

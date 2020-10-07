package Singleton;

public class Singleton {
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance != null) {
			synchronized (uniqueInstance) {
				if(uniqueInstance != null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}

package singleton;

public class SingleObject {
	
	private static SingleObject instance = new SingleObject();
	
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessages() {
		System.out.println("Hello World!");
	}

}

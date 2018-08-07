package proxy;

public class RealImage implements Image {
	private String firstName;
	
	public RealImage(String fileName) {
		this.firstName = fileName;
		loadFromDisk(fileName);
	}
	
	@Override 
	public void display() {
		System.out.println("Displaying " + firstName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}

package iterator;

public class Waitress {
	DinerMenu dinerMenu;
	
	public Waitress(DinerMenu dinerMenu) {
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("Menu");
		while (dinerIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)dinerIterator.next();
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.getPrice());
			System.out.println(menuItem.getName());
		}
	}
}

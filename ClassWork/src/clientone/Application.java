package clientone;

import threadandcollections.InventoryManager;

public class Application {

	public static void main(String[] args) {
		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {
			public void run() {
				manager.populateSoldProducts();
			}
		});
		Thread displayTask = new Thread(new Runnable() {
			public void run() {
				manager.displaySoldProducts();
			}
		});
		
		inventoryTask.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		displayTask.start();
	}

}

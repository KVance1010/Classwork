package threadandcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
// used in clientone
public class InventoryManager {

	List <Products> soldProducts = new CopyOnWriteArrayList<>();
	List <Products> purchasedProductsList = new ArrayList<>();
	
	public void populateSoldProducts() {
		for(int i = 0; i < 100; i++) {
			Products prod = new Products(i, "test_product_ " + i);
			soldProducts.add(prod);
			System.out.println("Added: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displaySoldProducts() {
		for(Products product : soldProducts) {
			System.out.println("Printing the sold product: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

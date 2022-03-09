package threadingex;

public class TaskImplements implements Runnable {
private String name;
	
	public TaskImplements (String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(name);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("This thread was interupted");
				return;   // If you put a return statement the thread will terminates execution
			}
		}
	}
}

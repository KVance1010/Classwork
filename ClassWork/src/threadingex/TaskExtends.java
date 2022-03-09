package threadingex;

public class TaskExtends extends Thread {
	private String name;
	
	public TaskExtends (String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(name);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

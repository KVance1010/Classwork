package threadingcounterprogram;

public class Main {

	public static void main(String[] args) {

		CountDown countDown = new CountDown();
		CountDownThread t1 = new CountDownThread (countDown);
		t1.setName("Thread 1");
		CountDownThread t2 = new CountDownThread(countDown);
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
	}
}

class CountDown {

	private int i;
	public void doCountDown() {
		for (i = 10; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ": i = " + i);

	}
}
}

class CountDownThread extends Thread{
	private CountDown threadCountDown;
	
	public CountDownThread(CountDown countDown) {
		threadCountDown = countDown;
	}
	public void run() {
		threadCountDown.doCountDown();
	}
	
}
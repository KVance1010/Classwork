package producerconsumerthreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

	public static void main(String[] args) {
		BlockingQueue<Integer> questionQuee = new ArrayBlockingQueue<>(5);

		Thread t1 = new Thread(new Producer(questionQuee));
		Thread t2 = new Thread(new Consumer(questionQuee));

		t1.start();
		t2.start();
	}

}

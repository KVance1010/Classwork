package threadpoolexecutorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable processor = new MessageProcessor(2);
		executor.execute(processor);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(5);
		executor.execute(processor4);
		
		executor.shutdown(); // Rejects any new tasks from being submitted. Gracefully shuts down the service
//		executor.shutdownNow(); // Terminates the executor service immediately
		
		
		// awaitTermination gives a time between each thread is executed. used instead of the while loop... below
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS); // this is an enum
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// This is an infinite loop that will keep going until all tasks are done and ensure "all tasks submitted" prints at the end.
		while(!executor.isTerminated()) {
			
		}
		
		System.out.println("All tasks submitted...");
	}

}

package threadingex;


public class ThreadingExampleMain {

	public static void main(String[] args) {
/*
		// extends Thread class
		System.out.println("Starting Thread 1");
		TaskExtends taskRunner = new TaskExtends("Thread-A");
		taskRunner.start();
		try {
			taskRunner.join(); // Makes other treads wait for this thread to finish... a way to synchronize.
	        // everything after has to wait. you can also use join(2000) waits for 2 seconds before executing.
			// if join is used on another tread the 2nd tread will take over. 
			//Once the second tread is done the first will continue.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Starting Thread 2");
		TaskExtends taskRunner2 = new TaskExtends("Thread-B");
		taskRunner2.setPriority(10);// setting priority will start this thread first if more than one is waiting
		// doesn't work well

		taskRunner2.start();
		 
		// implements Thread class(Runnable)
		System.out.println("Starting Thread 3");
		TaskImplements taskRunner3 = new TaskImplements("Thread-C");
		Thread t1 = new Thread(taskRunner3);
		t1.start();
		Thread.yield();                // wait until higher threads have run 

		// faster way of writing the same code
		System.out.println("Starting Thread 4");
		Thread t2 = new Thread(new TaskImplements("Thread-D"));
		while(t1.isAlive()) {   
			// the isAlive method is used to ensure the thread finishes before accessing the share attribute.
			// this is one way to solve concurrency problems with multi-threaded programs
		  //  System.out.println("Waiting...");
		  }
		t2.setPriority(1);
		t2.start();
	    // or this can be written "new Thread(new TaskImplements("Thread-D")).start();"
	    // this is shorthand and does not leave reference to the the thread
		
	   // This is how to create an anonymous class 
	   new Thread() {
		   public void run() {
			   System.out.println("Anonymous Thread");
		   }
	   }.start();      // the start method is required right after an anonymous class
		
		
	} // <- brace need to be commented out for 2nd half of code to work 
}  // <- brace need to be commented out for 2nd half of code to work
*/
		// Sequence portion of code
		System.out.println("Starting Sequence Thread");
		Sequence sequence = new Sequence();
		Worker worker1 = new Worker(sequence);
		worker1.start();
		Worker worker2 = new Worker(sequence);
		worker2.start();

	}

}

class Worker extends Thread {

	Sequence sequence = null;

	public Worker(Sequence sequence) {
		this.sequence = sequence;

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " got value: " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

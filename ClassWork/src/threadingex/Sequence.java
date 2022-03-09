package threadingex;

public class Sequence {
	private int value = 0;

	public int getNext() {
		
		// This prevents other threads from accessing this or control until this finishes
		 synchronized (this) {
			value++;
			return value;
		}
	}
}

    // extra information
	/* The synchronized call can also be added to the method definition/signature
	public synchronized int getNext() { // the synchronize on a method is a form of lock on the method and
	// prevents any other calls to this method. This makes it so that you do not have to use join() on every thread.
	*/
	
	// for  inter-thread communication you have wait and notify methods
	
	// Daemon threads run concurrently with main thread


package threadpoolexecutorframework;

public class MessageProcessor implements Runnable{

	private int message;
	
	public MessageProcessor(int message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " [RECEIVED] Message = " + message);
		respondToMessage(); // make thread sleep to simulate doing work
		System.out.println(Thread.currentThread().getName() + " (DONE) Processing Message = " + message);
	}
	
	public void respondToMessage() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to process message " +  message);
		}
	}

}

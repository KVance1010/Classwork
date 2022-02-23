package datastructurequeue;

public class TestQueueArray {

	public static void main(String[] args) {
		QueueArray queueArray = new QueueArray(3);
		
		System.out.println("Is the queue empty : " + queueArray.isEmpty());
		System.out.println("Is the queue full : " + queueArray.isFull());
		
		queueArray.enQueue(4);
		queueArray.enQueue(3);
		queueArray.enQueue(8);
		
		System.out.println("Item : " + queueArray.deQueue());
		System.out.println("Peek : "+ queueArray.peek());
		System.out.println("Item : " + queueArray.deQueue());
		System.out.println("Item : " + queueArray.deQueue());
//		System.out.println("Item : " + queueArray.deQueue());
		
	}
}

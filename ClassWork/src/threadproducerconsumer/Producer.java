package threadproducerconsumer;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNum;

	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}

	public void readQuestions(int questionNum) {
		synchronized (questionList) {
			while (questionList.size() == LIMIT) {
				System.out.println("Questions have piled up... Waiting for answers");
				try {
					questionList.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		synchronized (questionList) {
			System.out.println("New Question: " + questionNum);
			questionList.add(questionNum);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			questionList.notify();
		}
	}

	@Override
	public void run() {
		while(true)
		readQuestions(questionNum++);
	}

}

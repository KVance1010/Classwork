package threadproducerconsumer;

import java.util.List;

public class Consumer implements Runnable{

	List<Integer> questionList = null;

	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}

	public void answerQuestions() {
		synchronized (questionList) {
			while (questionList.isEmpty()) {
				System.out.println("No questions to answer... Waiting for questions");
				try {
					questionList.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		synchronized (questionList) {
			try {
				Thread.sleep(5000);
				System.out.println("Answered question: " + questionList.remove(0));
				questionList.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		while(true)
		answerQuestions();
	}

}


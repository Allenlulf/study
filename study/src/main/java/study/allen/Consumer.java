package study.allen;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Object> queue;

	public Consumer(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"remove");
	}
}

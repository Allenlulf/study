package study.allen;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue<Object> queue;
	
	public Producer(BlockingQueue<Object> queue){
		this.queue=queue;
	}

	@Override
	public void run() {
		queue.add(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+"add");
	}

}

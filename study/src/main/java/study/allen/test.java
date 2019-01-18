package study.allen;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class test {
	public static void main(String[] args) {
		BlockingQueue<Object>queue=new LinkedBlockingQueue<Object>(2);
		for(int i=0;i<5;i++){
			new Thread(new Producer(queue)).start();
			new Thread(new Consumer(queue)).start();
		}
	}
}

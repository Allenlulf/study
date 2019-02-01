package study.allen.AQS;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
	
	private static final int threadSize=550;
	
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(300);
		//加计时器
		final CountDownLatch countDownLatch=new CountDownLatch(threadSize);
		for (int i = 0; i < threadSize; i++) {
			final int threadnum=i;
			service.execute(()->{
				try {
					test(threadnum);
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					//计数器-1
					countDownLatch.countDown();
				}	
			});
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.shutdown();
		System.out.println("finish");
	}
	
	public static void test(int threadnum) throws InterruptedException {
	    Thread.sleep(1000);// 模拟请求的耗时操作
	    System.out.println("threadnum:" + threadnum);
	    Thread.sleep(1000);// 模拟请求的耗时操作
	  }

}

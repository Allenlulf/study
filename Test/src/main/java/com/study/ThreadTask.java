package com.study;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTask {
	public static void main(String[] args) throws Exception {
		ServiceTask task = new ServiceTask();
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> result = executor.submit(task);
        executor.shutdown();
        System.out.println("����ִ������");
        Thread.sleep(1000);
        System.out.println("task���н��Ϊ:" + result.get());
	}
}
class ServiceTask implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        int result = 0;
        // ����һ�����Ӵ�ļ���
        for(int i=1;i<100;i++){
            for (int j=0;j<i;j++){
                result +=j;
            }
        }
        return result;
    }
}


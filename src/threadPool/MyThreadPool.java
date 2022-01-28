package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			Runnable threadWorker = new ThreadWorker("" + i);
			executorService.execute(threadWorker);
		}
		
		executorService.shutdown();
		
        while (!executorService.isTerminated()) {   }  
        
        System.out.println("All threads have been finished.");  


	}

}

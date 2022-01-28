package threadPriority;

public class MyThreadPriority extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		MyThreadPriority tr1 = new MyThreadPriority();
		MyThreadPriority tr2 = new MyThreadPriority();
		MyThreadPriority tr3 = new MyThreadPriority();
		
		// There's no guarantee because it depends on JVM specification
		// Priority range is between 1 and 10 which Min is 1, Norm is 5 and Max is 10
		
		tr1.setPriority(MIN_PRIORITY);
		tr2.setPriority(MAX_PRIORITY);
		tr3.setPriority(NORM_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
		

	}

}

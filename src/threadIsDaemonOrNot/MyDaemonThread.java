package threadIsDaemonOrNot;

public class MyDaemonThread extends Thread{
	
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " isDaemon = " + Thread.currentThread().isDaemon());
	}
	

	public static void main(String[] args) {

		MyDaemonThread tr1 = new MyDaemonThread();
		MyDaemonThread tr2 = new MyDaemonThread();
		
		tr1.setDaemon(false);
		tr2.setDaemon(true); // It waits for other threads to be terminated, then terminates.
		
		tr1.start();
		tr2.start(); 
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " tr1:" + tr1.getState().toString() + " tr2:" + tr2.getState().toString());			
		}
		System.out.println("Finally tr1:" + tr1.getState().toString() + " tr2:" + tr2.getState().toString());			

	}

}

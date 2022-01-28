package threadPool;

public class ThreadWorker implements Runnable{
	
	private String msg;

	public ThreadWorker(String msg) {
		super();
		this.msg = msg;
	}
	
	@SuppressWarnings("static-access")
	private void process() {
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Starts: " + this.msg);
		process();
		System.out.println(Thread.currentThread().getName() + " Ends");
	}	

}

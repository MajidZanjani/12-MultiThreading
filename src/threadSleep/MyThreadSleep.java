package threadSleep;

public class MyThreadSleep extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(MyThreadSleep.this.getName() + " step " + i);
		}
	}

	public static void main(String[] args) {
		MyThreadSleep tr1 = new MyThreadSleep();
		MyThreadSleep tr2 = new MyThreadSleep();
		
		tr1.start();
		tr2.start();
		
		// With bellow method invoking,
		// tr1 & tr2 will be called as a normal objects not threads and no context-switching will happen.
		// tr1.run();
		// tr2.run();

	}

}

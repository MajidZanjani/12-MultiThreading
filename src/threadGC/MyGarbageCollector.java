package threadGC;

public class MyGarbageCollector{
	
	public void finalize() {
		System.out.println("A Garbage been collected.");
	}
	
	public static void main(String[] args) {
		
		MyGarbageCollector tr1 = new MyGarbageCollector();
		
		Thread tr2 = new Thread( new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());						
			}
		});
		
		tr1 = null; // Garbage
		tr2.start();
		
		System.gc();
		
	}




}

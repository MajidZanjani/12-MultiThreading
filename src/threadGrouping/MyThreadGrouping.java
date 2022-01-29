package threadGrouping;

public class MyThreadGrouping implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started.");    
		for (int i = 0; i < 100; i++) {  
			try {  
				Thread.sleep(10);  
			}  
			catch (InterruptedException e) {  
				System.out.println(e);  
			}  		  
		}  
		System.out.println(Thread.currentThread().getName() + " has been finished.");    
	}
	
	public static void main(String[] args) {
		MyThreadGrouping myThreadGrouping = new MyThreadGrouping();
		
		ThreadGroup tgParent = new ThreadGroup("Parent Thread Group");
		ThreadGroup tgChildGroup1 = new ThreadGroup(tgParent, "Child Thread Group1");
		ThreadGroup tgChildGroup2 = new ThreadGroup(tgParent, "Child Thread Group2");
		
		Thread tr1 = new Thread(tgChildGroup1, myThreadGrouping, "First Thread");
		Thread tr2 = new Thread(tgChildGroup1, myThreadGrouping, "Second Thread");
		Thread tr3 = new Thread(tgChildGroup2, myThreadGrouping, "Third Thread");
		Thread tr4 = new Thread(tgChildGroup2, myThreadGrouping, "Fourth Thread");		
		Thread tr5 = new Thread(tgParent, myThreadGrouping, "Sixth Thread");
		
		tgChildGroup1.setMaxPriority(1);
		tgChildGroup2.setMaxPriority(10);		
		
		tr1.start();
		tr2.start();
		tr3.start();
		tr4.start();
		tr5.start();
		
		System.out.println(tr1.getThreadGroup());
		System.out.println(tr2.getThreadGroup());
		System.out.println(tr3.getThreadGroup());
		System.out.println(tr4.getThreadGroup());
		System.out.println(tr5.getThreadGroup());
		
	}
	
}

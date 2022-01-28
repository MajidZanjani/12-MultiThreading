package threadName;

public class MyThreadName extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName()); 
		// System.out.println(this.getName()); 
	}
	
	public static void main(String[] args) {
		
		MyThreadName tr1 = new MyThreadName();
		MyThreadName tr2 = new MyThreadName();
		
		tr1.setName("My Thread Name");
		
		tr1.start();
		tr2.start();

	}

}

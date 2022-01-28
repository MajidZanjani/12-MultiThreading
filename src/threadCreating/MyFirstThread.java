package threadCreating;

public class MyFirstThread implements Runnable {
	
	public void run() {
		System.out.println("Thread is running...");		
	}
	
	public static void main(String[] args) {

		Runnable myRunnable = new MyFirstThread();
		Thread myThread = new Thread(myRunnable,"MyNewThread");
		
		myThread.start();
	
		String myString = myThread.getName();
		System.out.println("Name of the new thread is: " + myString);
		
	}
	
}

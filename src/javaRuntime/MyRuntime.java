package javaRuntime;

public class MyRuntime {

	public static void main(String[] args) throws Exception {
		Runtime jRuntime = Runtime.getRuntime();
		
		System.out.println("Total memory: " + jRuntime.totalMemory());
		System.out.println("Free memory: " + jRuntime.freeMemory());
		
		for (int i = 0; i < 10000; i++) {
			new MyRuntime();
		}
		
		 System.out.println("After creating 10000 instance, Free Memory: " + jRuntime.freeMemory());  
		 
		 System.gc();  
		 
		 System.out.println("After gc(), Free Memory: " + jRuntime.freeMemory());  // WTH!!!!!!

	}

}

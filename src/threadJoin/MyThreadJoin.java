package threadJoin;

public class MyThreadJoin extends Thread{

	public void run() {
		for (int i = 1; i < 6; i++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(this.getName() + " "+ i);
		}
	}
	
	public static void main(String[] args) {
	
		MyThreadJoin tr1 = new MyThreadJoin();
		MyThreadJoin tr2 = new MyThreadJoin();
		MyThreadJoin tr3 = new MyThreadJoin();
		
		tr1.start();
		
		try {
			tr1.join(700); // changing this parameter will effect joining time
		} catch (Exception e) {
			System.out.println(e);
		}
		
		tr2.start();
		tr3.start();

	}

}

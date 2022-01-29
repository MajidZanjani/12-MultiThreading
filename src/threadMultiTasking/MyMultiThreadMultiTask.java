package threadMultiTasking;

public class MyMultiThreadMultiTask {

	int cnt = 1;
	static int myNumber;
	
	public void DisplayOddNumber() {
		synchronized(this) {
			while (cnt < myNumber) {
				while (cnt %2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(cnt + " ");
				cnt ++;
				notify();
			}
		}		
	}

	public void DisplayEvenNumber() {
		synchronized(this) {
			while (cnt < myNumber) {
				while (cnt %2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(cnt + " ");
				cnt ++;
				notify();
			}
		}		
	}

	public static void main(String[] args) {
		
		myNumber = 30;
		
		MyMultiThreadMultiTask evenOdd = new MyMultiThreadMultiTask();
		
		Thread oddThread = new Thread(new Runnable() {
			@Override
			public void run() {
				evenOdd.DisplayOddNumber();				
			}			
		});
		
		Thread evenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				evenOdd.DisplayEvenNumber();				
			}			
		});
		
		oddThread.start();
		evenThread.start();

	}

}

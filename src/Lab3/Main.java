package Lab3;

public class Main {

	public static void main(String[] args) {
		UnsafeCounter c = new UnsafeCounter(0);

		IncrementThread[] threads = new IncrementThread[5];
		for (int i = 0; i < 5; i++) {
			threads[i] = new IncrementThread(c);
		}
		for (IncrementThread t : threads) {
			t.start();
		}
		
		for (IncrementThread t : threads) {
			try {
				t.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("final value: " + c.getValue());
	}
}

class IncrementThread extends Thread {
	UnsafeCounter c;

	IncrementThread(UnsafeCounter c) {
		this.c = c;
	}

	public void run() {
		c.increment();
	}
}
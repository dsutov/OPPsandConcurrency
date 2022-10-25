package Lab3.example5;

public class Main {

	public static void main(String[] args) {
		SafeCounter c = new SafeCounter(0);

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
	SafeCounter c;

	IncrementThread(SafeCounter c) {
		this.c = c;
	}

	public void run() {
		c.increment();
	}
}
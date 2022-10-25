package Lab3.example5;

public class SafeCounter {
	int value = 0;

	public SafeCounter(int value) {
		this.value = value;
	}

	synchronized void increment() {
		
			int temp = value;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			temp++;
			value = temp;
	}

	synchronized int getValue() {
		return value;
	}
}

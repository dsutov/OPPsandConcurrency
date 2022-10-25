package Lab3;
public class UnsafeCounter {
	int value = 0;
	
	public UnsafeCounter(int value) {
		this.value = value;
	}

	void increment() {
		
		int temp = value;
		temp++;
		value = temp ;
	}
	
	int getValue() {
		return value ;
	}
}

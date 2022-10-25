package Lab3;

/**
 * Bank takes money
 *
 * @author Dennis Sutov
 * @version 20/10/2022
 */
public class Bank implements Runnable {

	private Account account;
	
	public Bank(Account account) {		
		this.account = account;
	}

	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			account.subtractAmount(1000);
		}
	}
}

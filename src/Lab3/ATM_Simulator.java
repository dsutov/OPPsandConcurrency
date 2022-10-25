package Lab3;

/**
 * ATM starts the threads
 *
 * @author Dennis Sutov
 * @version 20/10/2022
 */
public class ATM_Simulator implements Runnable
{

	public static void main(String[] args) {
		// Create an Account object and initialize its balance to 1000.
		Account account = new Account();
		account.setBalance(1000);
		
		// Create a Company object and Thread to run it.
		Company company = new Company(account);
		Thread t1 = new Thread(company);

		
		// Create a Bank object and Thread to run it.
		Bank bank = new Bank(account);
		Thread t2 = new Thread(bank);

		// Customer
		//Customer customer = new Customer(account);
		//Thread t3 = new Thread(customer);

		
		// Write the initial balance to the console.
		System.out.printf("Account : Initial Balance: %f\n", account.getBalance());
		
		// Start the threads.
		t1.start();

		//Wait for the finalization of the two threads using the join() method and print in the console the final balance of the account.
		try {
			t1.join(); // waits for the thread to finish before starting the next one

			t2.start();
			t2.join();

			//t3.start();
			//t3.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.printf("Account : Final Balance: %f\n", account.getBalance());
	}

	@Override
	public void run() {}
}

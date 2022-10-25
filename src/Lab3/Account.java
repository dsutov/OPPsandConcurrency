package Lab3;/**
 * Account class
 *
 * @author Dennis Sutov
 * @version 20/10/2022
 */
public class Account
{
	private double balance;

	public Account() {}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void addAmount(double amount) {
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp += amount;
		balance = tmp;
		//System.out.println("+: " + balance);
	}

	public void subtractAmount(double amount) {
		double tmp = balance;
		try {
			Thread.sleep(10);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp -= amount;
		balance = tmp;
		//System.out.println("-: " + balance);
	}

}



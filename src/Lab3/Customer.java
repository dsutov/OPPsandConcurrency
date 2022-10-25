package Lab3;

/**
 * Customer adds money
 *
 * @author Dennis Sutov
 * @version 20/10/2022
 */
public class Customer implements Runnable
{

    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            account.addAmount(1000);
        }
    }
}

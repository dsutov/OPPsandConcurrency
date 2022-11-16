package Lab5.example1;
/**
 * creates the waiters and notifier objects then starts the threads
 *
 * @author Dennis Sutov
 * @version 11/11/2022
 */
public class WaitNotifyTest implements Runnable{

    public static void main(String[] args) {
        // Create a Message(), two Waiters(msg), and a Notifier(msg)
    	// Start Waiters and Notifier
    	// Print message "All the threads are started"
        Message msg = new Message("message");
        Waiter w1 = new Waiter(msg);
        Waiter w2 = new Waiter(msg);
        Notifier n1 = new Notifier(msg);


        new Thread(w1, "w1").start();
        new Thread(w2, "w2").start();
        new Thread(n1, "n1").start();
        System.out.println("All threads started");
    
    }

    @Override
    public void run() {}
}

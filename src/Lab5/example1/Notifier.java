package Lab5.example1;
/**
 *  Notifies the waiter class when thread is ran
 *
 * @author Dennis Sutov
 * @version 11/11/2022
 */
public class Notifier implements Runnable {

    private Message msg;
    
    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                //Set message and notify
                msg.setMsg("notified");
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
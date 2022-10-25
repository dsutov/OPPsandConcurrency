package Lab1;
/**
 * Simple Thread class implementing Runnable
 *
 * @author Dennis Sutov
 * @version 08/10/2022
 */
public class SimpleThreadRunnable implements Runnable
{

    public String str;

    public SimpleThreadRunnable(String str)
    {
        this.str = str;
    }

    /**
     * Run method - runs when the thread starts
     */
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + str);
            try {
                //sleep((long)(Math.random() * 1000));
                Thread.sleep(1000);
                //sleep(1000);
                //sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.println("DONE! " + str);
    }

    public static void main(String[] args)
    {
        Runnable s1 = new SimpleThreadRunnable("Dog");
        Thread t1 = new Thread(s1);
        t1.start();

        Runnable s2 = new SimpleThreadRunnable("Cat");
        Thread t2 = new Thread(s2);
        t2.start();
    }
}

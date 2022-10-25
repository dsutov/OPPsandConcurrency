package Lab1;
/**
 * Simple Thread class implementing runnable
 * Calculates the total time taken to run the program
 *
 * @author Dennis Sutov
 * @version 08/10/2022
 */
public class DSThreadRunnable implements Runnable
{
    public String str;
    public int delay;
    public int total_time = 0;

    public DSThreadRunnable(String str, int delay)
    {
        this.str = str;
        this.delay = delay;
    }

    /**
     * Run method - runs when the thread starts
     */
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + str);
            total_time = total_time + delay;
            try {
                Thread.sleep(delay);

            } catch (InterruptedException e) {}
        }
        System.out.println("DONE! " + str + ", " + "Total run time: " + total_time);
    }

    public static void main(String[] args)
    {
        Runnable s1 = new DSThreadRunnable("Dog", 1000);
        Thread t1 = new Thread(s1);
        t1.start();

        Runnable s2 = new DSThreadRunnable("Cat", 2000);
        Thread t2 = new Thread(s2);
        t2.start();
    }
}

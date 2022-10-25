package Lab1;
/**
 * Simple Thread class extending the Thread class
 *
 * Calculates the total time taken to run the program
 * @author Dennis Sutov
 * @version 08/10/2022
 */
public class DSThreads extends Thread
{

    public int delay;
    public int total_time = 0;


    public DSThreads(String str, int delay)
    {
        super(str);
        this.delay = delay;
    }
    /**
     * Run method - runs when the thread starts
     */
    @Override
    public void run()
    {
        for(int i = 0; i < 10; i++) {
            System.out.println(i + "" + getName());
            total_time = total_time + delay;

            try {
                sleep(delay);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("DONE! " + getName() + ", " + "Total run time: " + total_time);
    }

    public static void main(String[] args)
    {
        new DSThreads("Dog", 1400).start();
        new DSThreads("Cat", 1000).start();
    }
}

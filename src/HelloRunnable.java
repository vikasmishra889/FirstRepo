/**
 * Created by vikas.e.mishra on 1/3/2017.
 */
public class HelloRunnable implements Runnable {

    public void run(){
        System.out.println("This is run() method");
    }

    public static void main(String[] args) {
        //HelloRunnable hr = new HelloRunnable();
        //Thread t = new Thread(new HelloRunnable());
        //t.start();
        new Thread(new HelloRunnable()).start();
    }
}

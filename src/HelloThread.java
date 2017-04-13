/**
 * Created by vikas.e.mishra on 1/3/2017.
 */
public class HelloThread extends Thread {

    public void run(){
        System.out.println("This is run() method");
    }

    public static void main(String[] args) {
        new HelloThread().start();
    }
}

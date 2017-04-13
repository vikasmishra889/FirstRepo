/**
 * Created by vikas.e.mishra on 1/3/2017.
 */
public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {"Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"};

        for(int i=0; i<importantInfo.length; i++){
            Thread.sleep(4000);
            System.out.println("The value is -> "+importantInfo[i]);
        }
    }
}

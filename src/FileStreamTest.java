import java.io.*;

public class FileStreamTest {

    public static void main(String args[]) {

        try {
            String s = "Hello World";
            //byte bWrite[] = {11, 21, 3, 40, 5};
            byte bWrite[] = s.getBytes();
            OutputStream os = new FileOutputStream("C:\\TestWorkspace\\inputoutput\\newFile11.txt");
//            for (int x = 0; x < bWrite.length; x++) {
//                os.write(bWrite[x]);   // writes the bytes
//            }
            os.write(bWrite);
            os.close();

            InputStream is = new FileInputStream("C:\\TestWorkspace\\inputoutput\\newFile11.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
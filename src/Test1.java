/**
 * Created by vikas.e.mishra on 1/2/2017.
 */

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try {

            String filename = "newFile.txt";
            String workingDirectory = System.getProperty("user.dir");

            //****************//
            String dirLocation = "folderLink";
            String absoluteFilePath = "";

            //absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
            absoluteFilePath = workingDirectory + File.separator +dirLocation +File.separator + filename;

            System.out.println("Final filepath : " + absoluteFilePath);

            //****************//

            File file = new File(absoluteFilePath);

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already existed! So deleting and creating new File");
                file.delete();
                file.createNewFile();
            }

            String s = args[0];
            byte data[] = s.getBytes();

            OutputStream os = new FileOutputStream(file);
            os.write(data);
            os.close();

            System.out.println("Text entered is written into the file at location -> "+file);

            System.out.println("_++++++++++++++++++++++++++++++++++++_");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            StringBuffer bf = new StringBuffer();
            String line;
            while((line = br.readLine()) != null){
                bf.append(line);
            }
            System.out.println("Reading from file. Value in file -> "+bf.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


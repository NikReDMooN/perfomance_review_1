package examples.java_core_4_6_2;

import java.io.*;

public class example {


    void str() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void chr() {
        try (FileReader fileReader = new FileReader("file.txt")) {
            int ch = fileReader.read();
            while (ch != -1) {
                System.out.print((char) ch);
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package FileHandling;

import java.io.File;
import java.io.IOException;

public class Filehandling {
    public static void main(String args[]) {
        File file =  new File("E:\\exam\\demo.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}



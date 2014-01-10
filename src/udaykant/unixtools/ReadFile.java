package udaykant.unixtools;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public String readFile(String fileName) throws Exception {
        String fileData = "";
        File file = new File(fileName);
        String lines = "";
        try {
            Scanner fileContent = new Scanner(file);
            while (fileContent.hasNextLine()) {
                lines = fileContent.nextLine();
                fileData += lines + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return fileData;
    }
}

package udaykant.unixtools.client;

import udaykant.unixtools.ReadFile;
import udaykant.unixtools.ReduceSpaces;


public class ReduceSpaceClient {
    public static void main(String[] args) throws Exception {
        ReadFile file = new ReadFile();
        String fileData;
        fileData = file.readFile(args[0]);
        ReduceSpaces trimSpace = new ReduceSpaces();
        System.out.println(trimSpace.reduceSpace(fileData));
    }
}

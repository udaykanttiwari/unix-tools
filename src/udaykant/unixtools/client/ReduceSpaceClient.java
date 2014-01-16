package udaykant.unixtools.client;

import udaykant.unixtools.ReadFile;
import udaykant.unixtools.ReduceSpace;


public class ReduceSpaceClient {
    public static void main(String[] args) throws Exception {
        ReadFile file = new ReadFile();
        String fileData;
        fileData = file.readFile(args[0]);
        ReduceSpace trimSpace = new ReduceSpace();
        System.out.println(trimSpace.reduceSpace(fileData));
    }
}

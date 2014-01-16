package udaykant.unixtools.client;

import udaykant.unixtools.ReadFile;
import udaykant.unixtools.Uniq;

public class UniqClient {
    public static void main(String[] args) throws Exception {

        ReadFile file = new ReadFile();
        if (args.length == 0) {
            System.out.println("please give file and some option");
            return;
        }
        String fileData = file.readFile(args[0]);
        Uniq uniq = new Uniq();
        System.out.println(uniq.displayUniqLines(fileData));
    }
}

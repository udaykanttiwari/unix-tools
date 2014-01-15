package udaykant.unixtools.client;

import udaykant.unixtools.Cut;
import udaykant.unixtools.ReadFile;

public class CutClient {
    public static void main(String[] args) throws Exception {
        Cut cut = new Cut();
        if (args.length == 0) {
            System.out.println("please give file and some option");
            return;
        }
        ReadFile file = new ReadFile();
        String fileData;
        fileData = file.readFile(args[0]);
        if (args.length == 3) {
            if (args[1].startsWith("-f") && args[2].startsWith("-d")) {
                int field = Integer.parseInt(args[1].substring(2, args[1].length()));
                String delimiter = args[2].substring(2, args[2].length());
                System.out.println(cut.cutByField(fileData, field, delimiter));
            }
        }
        if (args.length == 2) {
            int field = Integer.parseInt(args[1].substring(2, args[1].length()));
            String delimiter = " ";
            System.out.println(cut.cutByField(fileData, field, delimiter));
        }
    }
}

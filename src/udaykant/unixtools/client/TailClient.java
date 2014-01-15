package udaykant.unixtools.client;

import udaykant.unixtools.ReadFile;
import udaykant.unixtools.Tail;

public class TailClient {
    public static void main(String[] args) throws Exception {
        Tail tail = new Tail();
        if (args.length == 0) {
            System.out.println("please give file and some option");
            return;
        }
        ReadFile file = new ReadFile();
        String fileData = file.readFile(args[0]);
        int length = fileData.split("\n").length;
        if(length < 10){
            System.out.println(tail.DisplayTailLines(fileData,length));
            return ;
        }

        if (args.length == 1) {
            System.out.println(tail.DisplayTail(fileData));
        }
        ;
        if (args.length == 2) {

            if (args[1].startsWith("-n")) {
                int numberOfBytes = Integer.parseInt(args[1].substring(2, args[1].length()));
                System.out.println(tail.DisplayTailLines(fileData, numberOfBytes));
            }
        }
    }
}

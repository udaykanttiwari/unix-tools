package udaykant.unixtools.client;

import udaykant.unixtools.Head;
import udaykant.unixtools.ReadFile;

public class HeadClient {
    public static void main(String[] args) throws Exception {
        Head head = new Head();
        if(args.length == 0){
            System.out.println("please give file and some option");
            return ;
        }
        ReadFile file = new ReadFile();
        String fileData = file.readFile(args[0]);
        int length = fileData.split("\n").length;
        if(length < 10){
            System.out.println(head.DisplayLines(fileData,length));
            return ;
        }
        if (args.length == 1) {
            System.out.println(head.DisplayHead(fileData));
        };
        if (args.length == 2) {

            if (args[1].startsWith("-n")) {
                int numberOfBytes = Integer.parseInt(args[1].substring(2, args[1].length()));
                System.out.println(head.DisplayLines(fileData, numberOfBytes));
            }
        }
    }
}

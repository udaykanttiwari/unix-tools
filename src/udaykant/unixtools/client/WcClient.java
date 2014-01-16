package udaykant.unixtools.client;

import udaykant.unixtools.ReadFile;
import udaykant.unixtools.WC;

public class WcClient {

    public static void main(String[] args)throws Exception{
        WC wc = new WC();
        if(args.length == 0){
            System.out.println("please give file and some option");
            return ;
        }
        ReadFile file = new ReadFile();
        String content= file.readFile(args[0]);
    int TotalLine    = wc.countLine(content);
    int TotalWord    = wc.wordCount(content);
    int TotalChar    = wc.countCharacter(content);
        System.out.println(TotalLine+" "+ TotalWord+" "+TotalChar+ args[0]);
    }
}

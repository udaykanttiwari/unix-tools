package udaykant.unixtools;

public class WC {
    public void wordCount(String fileData){
        String[] words = fileData.split(" ");
        System.out.println(words.length);
    }
    public void countCharacter(String fileData){
        String[] characters = fileData.split("");
        System.out.println(characters.length);
    }

    public void countLine(String fileData){
        String[] characters = fileData.split("\n");
        System.out.println(characters.length+1);
    }

    public static void main(String[] args)throws Exception{
        WC wc = new WC();
        ReadFile file = new ReadFile();
        String fileData= file.readFile(args[0]);
        if(args[1].startsWith("-l")){
           wc.countLine(fileData);
        }
        if(args[1].startsWith("-w")){
            wc.wordCount(fileData);
        }
        if(args[1].startsWith("-c")){
            wc.countCharacter(fileData);
        }
    }
}

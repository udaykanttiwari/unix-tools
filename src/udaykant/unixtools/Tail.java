package udaykant.unixtools;

public class Tail {
    public void DisplayTail(String fileData)throws Exception{
        System.out.println("ocming here");
        String[] Contents= fileData.split("\n");
        int range= Contents.length;
        for(int i = range-10;i<range;i++){
            System.out.println(Contents[i]);
        }
    }
    public void DisplayTailLines(String fileData,int numberOfBytes){
        String[] Contents= fileData.split("\n");
        int range = Contents.length;
        for(int i = range-numberOfBytes;i<range;i++){
            System.out.println(Contents[i]);
        }
    }
    public static void main(String[] args)throws Exception{
        Tail tail = new Tail();
        ReadFile file = new ReadFile();
        String fileData= file.readFile(args[0]);
        if(args.length == 1){
        tail.DisplayTail(fileData);
        };
        if(args.length == 2){

            if(args[1].startsWith("-n")){
            int numberOfBytes = Integer.parseInt(args[1].substring(2,args[1].length()));
            tail.DisplayTailLines(fileData,numberOfBytes);
            }
        }
    }
}

package udaykant.unixtools;

public class ReduceSpace {
    public  void reduceSpace(String fileData){
        String contents = fileData.replaceAll("\\ +"," ");
        System.out.println(contents);
    }
    public static void main(String[] args) throws Exception{
        ReadFile file = new ReadFile();
        String fileData= file.readFile(args[0]);
        ReduceSpace trimSpace = new ReduceSpace();
        trimSpace.reduceSpace(fileData);
    }
}

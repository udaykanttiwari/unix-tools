package udaykant.unixtools;

public class Tail {
    public String DisplayTail(String data)throws Exception{
        StringBuilder Lines = new StringBuilder();
        String[] Contents= data.split("\n");
        int range= Contents.length;
        if(Contents.length > 10){
            for(int i = range-10;i<range;i++){
                Lines.append(Contents[i]);
                Lines.append("\n");
            }
        }
        return Lines.toString();
    }
    public String DisplayTailLines(String data, int numberOfBytes){
        StringBuilder Lines = new StringBuilder();
        String[] Contents= data.split("\n");
        int range = Contents.length;
        for(int i = range-numberOfBytes;i<range;i++){
            Lines.append(Contents[i]);
            Lines.append("\n");
        }
        return Lines.toString();
    }

}

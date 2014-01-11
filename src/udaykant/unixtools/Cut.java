package udaykant.unixtools;

public class Cut {
    public void cutByField(String data,int field,String delimiter){
        String [] lines= data.split("\n");
        for(String s :lines){
            try{
                System.out.println(s.split(delimiter)[field]);
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(s.split(delimiter)[0]);
            }

        }
    }
    public static void main(String[] args) throws Exception {
        Cut cut = new Cut();
        ReadFile file = new ReadFile();
        String fileData= file.readFile(args[0]);
        if(args[1].startsWith("-f")&&args[2].startsWith("-d")){
            int field = Integer.parseInt(args[1].substring(2, args[1].length()));
            String delimiter = args[2].substring(2, args[2].length());
            cut.cutByField(fileData, field, delimiter);
        }
        int field = Integer.parseInt(args[1].substring(2, args[1].length()));
        String delimiter = "";
        cut.cutByField(fileData,field,delimiter);
    }
}

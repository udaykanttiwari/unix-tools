package udaykant.unixtools;

class ReduceSpace {
    public  void reduceSpace(String fileData){
        String contents = fileData.replaceAll("\\ +"," ");
        System.out.println(contents);
    }
    public static void main(String[] args) throws Exception{
        udaykant.unixtools.ReadFile file = new udaykant.unixtools.ReadFile();
        String fileData;
        fileData = file.readFile(args[0]);
        ReduceSpace trimSpace = new ReduceSpace();
        trimSpace.reduceSpace(fileData);
    }
}


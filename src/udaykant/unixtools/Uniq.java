package udaykant.unixtools;

public class Uniq {
    public String displayUniqLines(String text){
        String[] lines = text.split("\n");
        StringBuilder UniqLines = new StringBuilder();
        int length = lines.length;
        for (int i = 0; i <length-1 ; i++) {
            if( !( lines[i].equals(lines[i+1] )))
                UniqLines.append(lines[i]);
                UniqLines.append("\n");
        }
        UniqLines.append(lines[length-1]);
        return UniqLines.toString();
    }

}


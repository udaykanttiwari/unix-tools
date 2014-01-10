package udaykant.unixtools;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.FileReader;

public class Head {
    public String DisplayCharacters(String fileData,int numberOfBytes)throws Exception{
        String setOfCharacters= fileData.substring(0,numberOfBytes);
        return setOfCharacters;
    }
    public String DisplayLines(String fileData,int numberOfLines) throws Exception{
        String[] setOfLines= fileData.split("\n");
        String headData = "";
        for(int i=0;i<numberOfLines;i++){
            headData  = headData+ "\n" +setOfLines[i];
        }
        return headData;
    }
    public String DisplayHead (String fileData) throws Exception{
        String[] setOfLines= fileData.split("\n");
        System.out.print(setOfLines.length);
        String headData = "";
        for(int i=0;i<10;i++){
            headData  = headData+ "\n" +setOfLines[i];
        }
        return headData;
    }
}

package udaykant.unixtools;

public class WC {
    public int wordCount(String data){
        int count = 0;
        String[] temp = data.split("\n");
        for (String i : temp)
            count += i.split(" ").length;
        return count;
    }
    public int countCharacter(String data){
        String[] characters = data.split("");
        return characters.length;
    }

    public int countLine(String data){
        String[] characters = data.split("\n");
        return characters.length;
    }
}


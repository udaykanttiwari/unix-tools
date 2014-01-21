package udaykant.unixtools;

import java.util.Arrays;

public class Sort {
    public String sortWithoutOption(String content)throws Exception{
        String[] lines= content.split("\n");
        StringBuilder builder = new StringBuilder("");
        Arrays.sort(lines);
        for (String line : lines) {
            builder.append(line).append("\n");
        }
        return builder.toString();
    }
}

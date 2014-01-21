package udaykant.unixtools;

public class Cut {
    public String cutByField(String data, int field, String delimiter) {
        StringBuilder result = new StringBuilder();
        String[] lines = data.split("\n");
        for (String s : lines) {
            int length  = s.split(delimiter).length;
            if (length >= field) {
                result.append(s.split(delimiter)[field - 1]);
                result.append("\n");
            }
        }
        return result.toString();
    }
}
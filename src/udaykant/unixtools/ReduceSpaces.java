
package udaykant.unixtools;

public class ReduceSpaces {
    public String reduceSpace(String fileData) {
        return fileData.replaceAll(" +", " ");
    }
}


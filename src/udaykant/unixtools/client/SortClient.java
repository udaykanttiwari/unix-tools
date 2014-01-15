package udaykant.unixtools.client;

import udaykant.unixtools.ReadFile;
import udaykant.unixtools.Sort;

public class SortClient {
    public static void main(String[] args) throws Exception {
        Sort sort = new Sort();
        if (args.length == 0) {
            System.out.println("please give file and some option");
            return;
        }
        ReadFile file = new ReadFile();
        String fileData = file.readFile(args[0]);
        System.out.println(sort.sortWithoutOption(fileData));
    }
}

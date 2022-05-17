import java.util.ArrayList;
import java.util.List;

public class MainProgramList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

    }

    // Implementing method returnSize
    // returns the size of the list given to it as a parameter

    public static int returnSize(List<String> aList) {
        return aList.size();

    }
}

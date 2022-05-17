import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        // testing method

        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

       
            System.out.println(returnSize(names));
      
    }

    // implementing method returnSize
    // which returns the number of elements in the set that it receives as a
    // parameter.

    public static int returnSize(Set<String> namesList) {

        return namesList.size();
    }

}
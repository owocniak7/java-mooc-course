
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        
        System.out.println(strings);
        // Try your method in here
        removeLast(strings);
        removeLast(strings);
        
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        
        if (strings.size() == 0) {
            
        } else {
            strings.remove(strings.size()-1);
        }

    }
}

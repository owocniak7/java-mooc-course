
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int prints) {
        for (int i=1; i <= prints; i++) {
            System.out.println(i);
        }
    }
}

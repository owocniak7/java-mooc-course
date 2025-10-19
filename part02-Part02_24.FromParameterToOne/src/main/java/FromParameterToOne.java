

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int printFrom) {
        for (int i = printFrom; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

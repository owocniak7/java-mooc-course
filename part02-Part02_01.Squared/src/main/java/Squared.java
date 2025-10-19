
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int basenum = Integer.valueOf(scanner.nextLine());
        int squarenum = basenum*basenum;
        System.out.println(squarenum);
    }
}

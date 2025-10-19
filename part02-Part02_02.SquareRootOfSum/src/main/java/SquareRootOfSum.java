
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        double squareRoot = Math.sqrt(num1+num2);
        System.out.println(squareRoot);
    }
}

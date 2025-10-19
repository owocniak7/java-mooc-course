
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negNumbers = 0;
        
        while(true) {
            System.out.println("Give a number:");
            
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                negNumbers = negNumbers+1;
            } else if (number == 0) {
                break;
            }
        }
        
        System.out.println("Number of negative numbers: "+negNumbers);
    }
}

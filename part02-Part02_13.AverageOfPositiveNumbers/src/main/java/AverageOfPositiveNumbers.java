
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double positiveSum = 0;
        double positiveNum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            double number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else if (number > 0) {
                positiveNum = positiveNum+1;
                positiveSum = positiveSum+number;
            }
        }
        
        if (positiveNum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: "+(positiveSum/positiveNum));
        }
    }
}

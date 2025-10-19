
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        double userNumSum = 0;
        double numCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        while(true) {
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if(userNum == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            userNumSum += userNum;
            numCount++;
            if(userNum % 2 == 0) {
                evenCount++;
                continue;
            }
            oddCount++;
        }
        System.out.println("Sum: "+(int)userNumSum);
        System.out.println("Numbers: "+(int)numCount);
        System.out.println("Average: "+(userNumSum/numCount));
        System.out.println("Even: "+evenCount);
        System.out.println("Odd: "+oddCount);
    }
}

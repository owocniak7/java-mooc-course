
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        int loopNum = 0;
        
        while(loopNum <= number) {
            System.out.println(loopNum);
            loopNum++;
        }
    }
}

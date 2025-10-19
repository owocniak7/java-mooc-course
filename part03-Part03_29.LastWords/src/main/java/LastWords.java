
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            
            if (!(userInput.equals(""))) {
                String[] pieces = userInput.split(" ");
                System.out.println(pieces[pieces.length-1]);
            } else {
                break;
            }
        }        

    }
}

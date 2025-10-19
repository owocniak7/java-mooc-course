
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int birthYear = 0;
        int birthSum = 0;
        String longestName = "";
        
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            
            String[] data = userInput.split(",");
            birthYear = Integer.valueOf(data[1]);
            birthSum += birthYear;
            counter++;
            
            if (data[0].length() > longestName.length()) {
                longestName = data[0];
            }
        }
        
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+((double)birthSum/(double)counter));
    }
}


import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int oldest = 0;
        String name = "";
        
        while (true) {
            String userInput = scanner.nextLine();
            
            if (userInput.equals("")) {
                break;
            }
            
            String[] data = userInput.split(",");
            age = Integer.valueOf(data[1]);
            
            if (age > oldest) {
                oldest = age;
                name = data[0];
            }
        }
        System.out.println("Name of the oldest: "+name);
    }
}

import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        System.out.println("Grah");
        Scanner skanuj = new Scanner(System.in);
        
        System.out.println("Wpisz wiadomosc: ");
        String message = skanuj.nextLine();
        
        System.out.println(message);
        
    }
}

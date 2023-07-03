import java.util.Scanner;

public class MessageView {
    private final Scanner scanner = new Scanner(System.in); // stored here so we don't cause conflicts with System.in

 
    public void printMenu() {
        System.out.println("Welcome to Wonderland Messenger.");
        System.out.println("[C]: compose new message");
        System.out.println("[S]: search for a message");
        System.out.println("[X]: exit");
    }   

    

    public void print(String s) {
        System.out.println(s);
    }

    public void closeScanner() {
        scanner.close();
    }

    public String getInput() {
        System.out.print("Enter your search phrase: ");
        return scanner.nextLine();
    }

    public String getInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();  }




}

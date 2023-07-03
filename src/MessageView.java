import java.util.Scanner;

public class MessageView {
    private final Scanner scanner = new Scanner(System.in); // stored here so we don't cause conflicts with System.in

    public String toString(OpenMessage m){
        String s = "TO: " + m.getTo() + "\n";
        s += "FROM: " + m.getFrom() + "\n";
        s += "SUBJECT: " + m.getSubject() + "\n";
        s += "BODY: " + m.getBody() + "\n";
        return s;
    }

    public void printMenu() {
        System.out.println("Welcome to the Message App!");
        System.out.println("What would you like to do?");
        System.out.println("Search (s) | List (l) | Exit (x)");
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

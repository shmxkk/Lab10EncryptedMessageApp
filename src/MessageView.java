import java.util.Scanner;

public class MessageView {
    private final Scanner scanner = new Scanner(System.in); // stored here so we don't cause conflicts with System.in

    public String messageToString(OpenMessage m){
        String s = "TO: " + m.getTo() + "\n";
        s += "FROM: " + m.getFrom() + "\n";
        s += "SUBJECT: " + m.getSubject() + "\n";
        s += "BODY: " + m.getBody() + "\n";
        return s;
    }

}

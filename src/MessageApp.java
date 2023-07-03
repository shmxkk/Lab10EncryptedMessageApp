import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class MessageApp {
    public final ArrayList<OpenMessage> messages;
    private final MessageView view;

    public MessageApp(ArrayList<OpenMessage> messages) {
        this.messages = messages;
        view = new MessageView();
    }

    public void go() {
        String command = "y";
        while (!command.equals("x")) {
            view.printMenu();
            String input = view.getInput("What would you like to do?");
            command = input.toLowerCase().substring(0, 1); // first character only, lower case
            processCommand(command);
        }
    }

    public void processCommand(String command) {  
        if (command.equals("s")) {
            String result = searchHelper();
            view.print(result);
        }
        else if (command.equals("c")) {
            composeHelper();
            
        }
        else if (command.equals("x")) {
            view.print("Exiting...");
        }
        else {
            view.print("Invalid command.");
        }
    }

    private String searchHelper() {
        String searchType = view.getInput("What type of search would you like to do?\nOptions are: subject, to, from").toLowerCase();
        String term = view.getInput("Enter your search phrase: ").toLowerCase();
        StringBuilder s = new StringBuilder();
        if (searchType.contains("to")) {
            for (OpenMessage m : messages) {
                if (m.searchTo(term)) {
                    s.append("Found message!\n");
                    //System.out.println(m.toString());
                    s.append(m.toString());
                }
            }
            if(!(s.length() == 0)){
                return s.toString();
            }
            else {
                return "No message found.";
            }
        }
        else if (searchType.contains("from")) {
            for (OpenMessage m : messages) {
                if (m.searchFrom(term)) {
                    s.append("Found message!\n");
                    //System.out.println(m.toString());
                    s.append(m.toString());
                }
            }
            if(!(s.length() == 0)){
                return s.toString();
            }
            else {
                return "No message found.";
            }
        }
        else if (searchType.contains("subject")) {
            for (OpenMessage m : messages) {
                if (m.searchSubject(term)) {
                    s.append("Found message!\n");
                    //System.out.println(m.toString());
                    s.append(m.toString());
                }
            }
            if(!(s.length() == 0)){
                return s.toString();
            }
            else {
                return "No message found.";
            }
        }
        return "Invalid command.";
    }

    public void composeHelper() {
        String to = view.getInput("Enter the recipient's email address: ");
        String from = view.getInput("Enter your email address: ");
        String subject = view.getInput("Enter the subject of your message: ");
        String body = view.getInput("Enter the body of your message: ");
        OpenMessage m = new OpenMessage(to, from, subject, body);
        messages.add(m);
        String fileName = view.getInput("Enter the name of the file you would like to write to: ");
        try {
            PrintWriter pw = new PrintWriter(fileName);
            Key k = new Key(1, 3);
            for(OpenMessage msg : messages){
                //pw.print(m.encrypt(msg.toString(), k));
                pw.print(msg.toString());

            }

            pw.close();
        }
        catch (FileNotFoundException e) {
            view.print("File not found.");
        }
    }

}
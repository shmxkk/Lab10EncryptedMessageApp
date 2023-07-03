import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MessageLoader {

    public static ArrayList<OpenMessage> loadFile(String filename) {
        ArrayList<OpenMessage> messageList = new ArrayList<OpenMessage>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String to = parseLine(scanner.nextLine());
                String from = parseLine(scanner.nextLine());
                String sub = parseLine(scanner.nextLine());
                String body = parseLine(scanner.nextLine());
                messageList.add(new OpenMessage(to, from, sub, body));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return messageList;
    }

    public static String parseLine(String line) {
        int index = line.indexOf(":");
        String parsedLine = line.substring(index + 1).trim();
        return parsedLine;
    }

}

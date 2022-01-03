import java.util.ArrayList;

public class Message {

    protected String to;
    protected String from;
    protected String subject;
    protected String body;

    public Message(String to, String from, String subject, String body){
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }

    public int searchBySubject(ArrayList<Message> list, String subject){
        for (Message m : list) {
            if(m.subject.equalsIgnoreCase(subject)){
                return list.indexOf(m);
            }
        }
        return -1;
    }
}

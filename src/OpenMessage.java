public class OpenMessage implements Message {

    public OpenMessage(String to, String from, String subject, String body) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }
    protected String to;
    protected String from;
    protected String subject;
    protected String body;
    
    public String getBody() {
        return body;
    }
    public String getTo() {
        return to;
    }
    public String getSubject() {
        return subject;
    }
    public String getFrom() {
        return from;
    }
    public boolean search(String term, String part) {
        if (part.equals("to")) {
            return searchTo(term);
        }
        else if (part.equals("from")) {
            return searchFrom(term);
        }
        else if (part.equals("subject")) {
            return searchSubject(term);
        }
        else {
            return false;
        }
    }
    public boolean searchSubject(String term) {
        return subject.toLowerCase().contains(term.toLowerCase());
    }
    public boolean searchTo(String term) {
        return to.toLowerCase().contains(term.toLowerCase());
    }
    public boolean searchFrom(String term) {
        return from.toLowerCase().contains(term.toLowerCase());
    }

}
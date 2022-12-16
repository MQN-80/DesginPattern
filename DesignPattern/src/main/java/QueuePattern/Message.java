package QueuePattern;

public class Message {
    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(String content){
        this.content=content;
    }
}

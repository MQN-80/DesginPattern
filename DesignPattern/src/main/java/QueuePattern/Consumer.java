package QueuePattern;

import java.util.List;

public class Consumer {
    private List<Message> message;
    public Consumer(List<Message> message){
        this.message=message;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }
}

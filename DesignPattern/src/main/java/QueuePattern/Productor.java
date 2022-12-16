package QueuePattern;

import java.util.List;

public class Productor {
    private List<Message> message;
    public Productor(List<Message> message){
        this.message=message;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }
}

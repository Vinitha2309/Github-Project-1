import java.time.LocalTime;

public class ChatBot {

    public String respond(String input) {
        input = input.toLowerCase();
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How are you feeling today?";
        } else if (input.contains("not good")) {
            return "I'm sorry to hear that. Would you like me to notify a caregiver?";
        } else if (input.contains("reminder")) {
            return "Your next reminder is at " + LocalTime.now().plusMinutes(1).toString();
        } else {
            return "I’m here to help. You can say 'hello', 'reminder', or talk to me!";
        }
    }
}

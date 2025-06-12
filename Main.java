import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    private TextArea chatArea;
    private TextField inputField;
    private ChatBot bot;

    @Override
    public void start(Stage primaryStage) {
        bot = new ChatBot();

        chatArea = new TextArea();
        chatArea.setEditable(false);

        inputField = new TextField();
        inputField.setPromptText("Say something...");
        inputField.setOnAction(e -> handleInput());

        Button sendBtn = new Button("Send");
        sendBtn.setOnAction(e -> handleInput());

        HBox inputBox = new HBox(10, inputField, sendBtn);
        VBox root = new VBox(10, chatArea, inputBox);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Elderly Care Companion Bot");
        primaryStage.setScene(scene);
        primaryStage.show();

        ReminderManager.scheduleReminder("Take medicine", 60); // every 60 seconds for demo
    }

    private void handleInput() {
        String userInput = inputField.getText();
        if (userInput.isEmpty()) return;

        chatArea.appendText("You: " + userInput + "\n");
        String response = bot.respond(userInput);
        chatArea.appendText("Bot: " + response + "\n");
        inputField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

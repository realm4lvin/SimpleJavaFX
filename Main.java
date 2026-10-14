import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label title = new Label("Student Registration");

        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        TextField ageField = new TextField();
        ageField.setPromptText("Enter your age");

        Button button = new Button("Register");
        Label result = new Label();

        button.setOnAction(event -> {
            String name = nameField.getText();
            String age = ageField.getText();
            result.setText("Registered: " + name + ", Age: " + age);
        });

        VBox layout = new VBox(
            10,
            title,
            nameField,
            ageField,
            button,
            result
        );

        Scene scene = new Scene(layout, 400, 300);

        stage.setTitle("Student Registration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
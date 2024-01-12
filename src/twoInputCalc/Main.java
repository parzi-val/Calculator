package twoInputCalc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("(2) Input Calculator");

        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Label Result = new Label();
        Button sum = new Button("Sum");
        Button sub = new Button("Subtract");

        sum.setOnAction(e -> {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            int sumResult = n1 + n2;
            Result.setText("Result: " + sumResult);
        });

        sub.setOnAction(e -> {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            int subResult = n1 - n2;
            Result.setText("Result: " + subResult);
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                new Label("Enter two nums"),
                num1, num2, sum, sub, Result);
        layout.setSpacing(10);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("This is the title");

        //close by clicking the red arrow button
        window.setOnCloseRequest( e -> closeProgram());

        //codes to open a new AlertBox
//        Button button = new Button("Close program");
//        button.setOnAction(e -> AlertBox.display("Title of the window", "this is an alert box"));


        //codes to open a new ConfirmBox, and check if it needs to be closed
//        Button button = new Button("Close program");
//        button.setOnAction(e ->
//        {boolean response = ConfirmBox.display("Title of the window", "Are you sure");
//                if (response)
//                    window.close();
//        }
//        );

        //codes to close window using method named closeProgram
        Button button = new Button("Close program");
        button.setOnAction(e -> {
            e.consume();
            closeProgram();
                }

        );

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.show();
    }



    private void closeProgram(){
       Boolean answer = ConfirmBox.display("Title", "Want to exit?");
       if (answer)
           window.close();
    }




}


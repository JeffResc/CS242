import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlers extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setSpacing(10.0f);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #333333");

        TextField textField = new TextField();

        Button button1 = new Button();
        button1.setOnAction( new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ) {
                textField.setText( textField.getText() + "-button1-" );
            }
        }
        

        Button button2 = new Button();
        button2.setOnAction( new EventHandler<ActionEvent>() {
            public void handle( ActionEvent ae ) {
                textField.setText( textField.getText() + "-button2-" );
            }
        }
        
        /*VBox vbox1 = new VBox();
        vbox1.addEventFilter( MouseEvent.MOUSE_RELEASED, new EventHandler<ActionEvent>() {
            public void handle( MouseEvent me ) {
                textField.setText( textField.getText() + "-vBox1-" );
            }
        }
        
        VBox vbox2 = new VBox();
        vbox2.addEventFilter( MouseEvent.MOUSE_RELEASED, new EventHandler<ActionEvent>() {
            public void handle( MouseEvent me ) {
                textField.setText( textField.getText() + "-vBox2-" );		
                me.consume();
            }
        }*/
        
        

        // Create a new Scene object with the VBox root
        root.getChildren().add(textField);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene); // set the scene on the Stage object
        primaryStage.show(); // show the Stage object (i.e., the window)
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
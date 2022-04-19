import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;

public class SimpleAnimation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth( 50.0 );
        rectangle.setHeight( 60.0 );
        rectangle.setX( 0.0 );
        rectangle.setY( 20.0 );
        rectangle.setStyle( "-fx-fill: blue;" );
        root.getChildren().add(rectangle);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for ( int i=0; i < 200; i++) {
                    rectangle.setX(i);
                    rectangle.setRotate( i );
                    try {
                        Thread.sleep( 33 );
                    } catch (InterruptedException ie ) {}
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        Scene scene = new Scene( root, 250, 100 );
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
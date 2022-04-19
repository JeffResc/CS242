import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.util.Duration;

public class TimelineExample extends Application {

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

        KeyFrame keyFrame0 = new KeyFrame(
                Duration.ZERO,
                new KeyValue( rectangle.translateXProperty(), 0.0 ),
                new KeyValue( rectangle.translateYProperty(), 0.0 ),
                new KeyValue( rectangle.rotateProperty(), 0.0 )
        );

        KeyFrame keyFrame2000 = new KeyFrame(
                new Duration( 2000 ),
                new KeyValue( rectangle.translateXProperty(), 150.0 ),
                new KeyValue( rectangle.translateYProperty(), 0.0 ),
                new KeyValue( rectangle.rotateProperty(), 0.0 )
        );

        KeyFrame keyFrame4000 = new KeyFrame(
                new Duration( 4000 ),
                new KeyValue( rectangle.translateXProperty(), 150.0 ),
                new KeyValue( rectangle.translateYProperty(), 0.0 ),
                new KeyValue( rectangle.rotateProperty(), 45.0 )
        );

        KeyFrame keyFrame6000 = new KeyFrame(
                new Duration( 6000 ),
                new KeyValue( rectangle.translateXProperty(), 150.0 ),
                new KeyValue( rectangle.translateYProperty(), 150.0 ),
                new KeyValue( rectangle.rotateProperty(), 45.0 )
        );

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add( keyFrame0 );
        timeline.getKeyFrames().add( keyFrame2000 );
        timeline.getKeyFrames().add( keyFrame4000 );
        timeline.getKeyFrames().add( keyFrame6000 );
        timeline.play();

        Scene scene = new Scene( root, 250, 250 );
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
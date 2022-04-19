import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Path;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.util.Duration;

public class TransitionExample extends Application {

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

        Path p = new Path();

        p.getElements().add( new MoveTo( 40, 40));
        p.getElements().add( new LineTo( 200, 40));
        p.getElements().add( new LineTo( 200, 200 ) );
        p.getElements().add(
                new CubicCurveTo( 200, 80, 150, 210, 100, 100));

        root.getChildren().add(p);


        PathTransition pt = new PathTransition();
        pt.setDuration( new Duration( 10000));
        pt.setNode(rectangle);
        pt.setPath( p );
        pt.play();

        Scene scene = new Scene( root, 250, 250 );
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

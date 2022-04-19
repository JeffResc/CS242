import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;

public class CUAnimation extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Rectangle r = new Rectangle();
			r.setWidth(100.0);
			r.setHeight(100.0);
			r.setX(0.0);
			r.setY(0.0);
			r.setStyle( "-fx-fill: blue;" );
			root.getChildren().add(r);
            
            Path p = new Path();
            p.setStrokeWidth(10);

            // C
            p.getElements().add(new MoveTo(150, 50));
            p.getElements().add(new LineTo(150, 50));
            p.getElements().add(new LineTo(50, 50));
            p.getElements().add(new LineTo(50, 200));
            p.getElements().add(new LineTo(150, 200));

            // U
            p.getElements().add(new MoveTo(200, 50));
            p.getElements().add(new LineTo(200, 200));
            p.getElements().add(new LineTo(300, 200));
            p.getElements().add(new LineTo(300, 50));

            root.getChildren().add(p);

            PathTransition pt = new PathTransition();
            pt.setDuration(new Duration(10000));
            pt.setNode(r);
            pt.setPath(p);
            pt.play();

			Scene scene = new Scene(root,350,250);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
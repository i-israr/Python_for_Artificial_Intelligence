import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FirstGUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create button
		Button btn1 = new Button("A button");
		//btn1.setOnAction(new MyListener());
		//root element which is group here
		Group root = new Group();
		root.getChildren().add(btn1);
		//scene
		Scene scene = new Scene(root,400,400);
		//put the scene on the stage
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}

}

package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.hxd.view.DrawArcLine;
import com.hxd.view.MyCanvas;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//MyCanvas convas = new MyCanvas(900,600);
			DrawArcLine root = new DrawArcLine();
			//root.getChildren().add(convas);
			root.Initialize();
			Scene scene = new Scene(root,1080,720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("±´Èû¶ûÈý´ÎÇúÏß");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

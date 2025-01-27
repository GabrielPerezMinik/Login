package dad.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Controlador controlador = new Controlador();

		Scene scene = new Scene(controlador.getView(), 300, 250);

		primaryStage.setScene(scene);
		primaryStage.setTitle("login.fxml");
		primaryStage.show();
	
	}

	public static void main(String[] args) {
		launch(args);

	}

}

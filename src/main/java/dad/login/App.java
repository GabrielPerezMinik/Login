package dad.login;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		if() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Inicar sesión");
		alert.setHeaderText("Acceso permitido");
		alert.setContentText("Las credenciales de acceso son válidas.");

		alert.showAndWait();
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Inicar sesión");
			alert.setHeaderText("Acceso denegado");
			alert.setContentText("El usuario y/o contraseña no son válidos");

			alert.showAndWait();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}

}

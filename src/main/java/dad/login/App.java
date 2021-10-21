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
		alert.setTitle("Inicar sesi�n");
		alert.setHeaderText("Acceso permitido");
		alert.setContentText("Las credenciales de acceso son v�lidas.");

		alert.showAndWait();
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Inicar sesi�n");
			alert.setHeaderText("Acceso denegado");
			alert.setContentText("El usuario y/o contrase�a no son v�lidos");

			alert.showAndWait();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}

}

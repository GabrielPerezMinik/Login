package dad.login;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertMensaje {

	public static void mostrarAlert(AlertType tipoAlerta, String cabecera, String contenido) {
		Alert alert = new Alert(tipoAlerta);
		alert.setTitle("Inicio de sesión");
		alert.setHeaderText(cabecera);
		alert.setContentText(contenido);

		alert.showAndWait();
	}

}

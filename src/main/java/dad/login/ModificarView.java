package dad.login;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ModificarView extends VBox {

	/* Controles utilizados en la vista */
	Label labelusuario;
	Label labelcontrasena;
	static TextField userText;
	static PasswordField contraText;
	Button cancelarButton;
	Button accederButton;
	static CheckBox ldap;
	HBox usuarioBox;
	HBox contrasenaBox; 
	HBox botonesBox;
	
	
	public ModificarView() {
		super();

		labelusuario = new Label("Usuario:");
		labelusuario.setPrefWidth(100);

		labelcontrasena = new Label("Contraseña:");
		labelcontrasena.setPrefWidth(100);

		userText = new TextField();

		contraText = new PasswordField();

		cancelarButton = new Button("Cancelar");
		accederButton = new Button("Acceder");
		ldap = new CheckBox("Usar LDAP");

		usuarioBox = new HBox(5, labelusuario, userText);
		usuarioBox.setAlignment(Pos.CENTER);
		
		contrasenaBox = new HBox(5, labelcontrasena, contraText);
		contrasenaBox.setAlignment(Pos.CENTER);
		
		botonesBox = new HBox(5, accederButton, cancelarButton);
		botonesBox.setAlignment(Pos.CENTER);

		setSpacing(15);	
		setAlignment(Pos.CENTER);
		getChildren().addAll(usuarioBox, contrasenaBox,ldap, botonesBox);
		
	}

	public static TextField getuserText() {
		return userText;
	}

	public static TextField getcontrasenaText() {
		return contraText;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public static CheckBox getldap() {
		return ldap;
	}

}

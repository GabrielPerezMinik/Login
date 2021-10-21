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

	private TextField userText;
	private PasswordField contraText;
	
	private Button aceptarButton;
	private Button accederButton;
	
	private CheckBox ldap;
	
	
	public ModificarView() {
		super();
		
		userText = new TextField();
		userText.setPromptText("Nombre de Usuario");
		
		contraText = new PasswordField();
		contraText.setPromptText("Contraseña de usuario");
		
		aceptarButton = new Button("Cancelar");
		accederButton = new Button("Acceder");
		
		
		HBox valorBox = new HBox(5,userText);
		HBox botonesBox = new HBox(5, accederButton);
		
		
		setSpacing(5);
		setFillWidth(false);
		setAlignment(Pos.CENTER);
		getChildren().addAll(valorBox, ldap,aceptarButton, botonesBox);
	}


	public TextField getValorText() {
		return userText;
	}


	public Button getEstablecidoButton() {
		return aceptarButton;
	}


	public Button getIncrementarButton() {
		return accederButton;
	}
		
	public CheckBox getldap() {
		return ldap;
	}
}

package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;

public class Controlador {

	private ModificarView vista = new ModificarView();
	private ModificarModel modelo = new ModificarModel();
	private AuthService auth;
	private LdapAuthService ldap;
	private String user = ModificarView.getuserText().getText();
	private String pass = ModificarView.getcontrasenaText().getText();
	boolean isValid = false;

	public Controlador() {

		/**
		 * Método asociado al botón Acceder
		 */
		vista.getAccederButton().setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				if (ModificarView.getldap() != null) {

					try {
						if (ldap.login(user, pass)) {
							isValid = true;
						} else {
							isValid = false;

							try {

								if (isValid) {
									AlertMensaje.mostrarAlert(AlertType.INFORMATION, "Acceso permitido",
											"Las credenciales de acceso son válidas.");
								} else {
									AlertMensaje.mostrarAlert(AlertType.ERROR, "Acceso denegado",
											"El usuario y/o contraseña no son válidos.");
								}

							} catch (Exception e) {
								AlertMensaje.mostrarAlert(AlertType.ERROR, "Error", e.getMessage());
							}

						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				
				else {
					try {
						if (auth.login(user, pass)) {
							isValid = true;
						} else {
							isValid = false;

							try {

								if (isValid) {
									AlertMensaje.mostrarAlert(AlertType.INFORMATION, "Acceso permitido",
											"Las credenciales de acceso son válidas.");
								} else {
									AlertMensaje.mostrarAlert(AlertType.ERROR, "Acceso denegado",
											"El usuario y/o contraseña no son válidos.");
								}

							} catch (Exception e) {
								AlertMensaje.mostrarAlert(AlertType.ERROR, "Error", e.getMessage());
							}

						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		/**
		 * Método asociado al botón Cancelar
		 */
		vista.getCancelarButton().setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				AlertMensaje.mostrarAlert(AlertType.INFORMATION, "Salida del Sistema",
						"Ha decidido salir del sistema sin autenticarse.");

				System.exit(0);

			};

		});

	}

	/**
	 * Retorna la vista completa
	 */
	public ModificarView getView() {
		return vista;
	}

}

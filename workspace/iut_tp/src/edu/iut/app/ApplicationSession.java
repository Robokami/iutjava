package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession {
	
	// Exercice 1 : G�rer l'internationation
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private /*Qu'est ce qu'un singleton ?*/ static ApplicationSession session = null;
	private ApplicationSession() {
		/* Definir US comme locale par d�faut */
		Locale.setDefault(new Locale("US"));
		
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edt.iut.exceptions", locale);
		sessionGuiLogger = /* Initialiser le logger */
		sessionGuiLogger.setLevel(/* Touls les message doivent être affiché */));
		sessionExceptionLogger = /* Logger pour exception */
		sessionExceptionLogger.setLevel(/* Touls les message doivent être affiché */);
	}
	
	
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=/* récupérer les resources */
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
}

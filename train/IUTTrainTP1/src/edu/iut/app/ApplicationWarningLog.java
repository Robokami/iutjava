package edu.iut.app;

public abstract class ApplicationWarningLog extends AbstractApplicationLog {

	/* profite de l'h�ritage */
	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}


}

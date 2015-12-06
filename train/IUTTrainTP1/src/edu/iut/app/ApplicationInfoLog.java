package edu.iut.app;

public abstract class ApplicationInfoLog extends AbstractApplicationLog {

	/* profite de l'héritage */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
        super.fireMessage("[INFO]", this.message);
	}

}

package edu.iut.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import edu.iut.app.ApplicationErrorLog;

public class ApplicationErrorLogTest {

	@Test
	public void test() {
		ApplicationErrorLog error = new ApplicationErrorLog();
		ApplicationErrorLog error2 = new ApplicationErrorLog();
		
		System.out.println("Test du message d'erreur");
		error.setMessage("Un message");
		assertEquals(error.getMessage(),"[ERROR]un message");

	}

}

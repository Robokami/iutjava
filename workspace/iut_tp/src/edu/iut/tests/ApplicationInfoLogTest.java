package edu.iut.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iut.app.ApplicationInfoLog;

public class ApplicationInfoLogTest {

	@Test
	public void test() {
		ApplicationInfoLog info = new ApplicationInfoLog();
		ApplicationInfoLog info2 = new ApplicationInfoLog();

		System.out.println("Test du message d'erreur");
		info.setMessage("Un message");
		assertEquals(info.getMessage(),"[INFO]un message");

	}

}
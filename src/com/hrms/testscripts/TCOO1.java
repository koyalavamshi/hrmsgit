package com.hrms.testscripts;

import java.awt.AWTException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TCOO1 extends General {
@Test
  public void TC001() throws AWTException {
	DOMConfigurator.configure("log4j.xml");
        General obj = new General();
        obj.openApplication();
        obj.LoginApplication();
        obj.LogoutApplication();
        obj.Close();
	}

}

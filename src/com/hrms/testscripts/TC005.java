package com.hrms.testscripts;

import java.awt.AWTException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC005 extends General{
@Test
   public void TC005() throws AWTException {
	DOMConfigurator.configure("log4j.xml");
	
        General obj = new General();
         obj.openApplication();
         obj.LoginApplication();
         obj.Frame();
         obj.Dropdown();
         obj.LogoutApplication();
         obj.Close();
          
	}

}

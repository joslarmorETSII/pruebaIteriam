package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BrowserManagerEnumChrome {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.CHROME);
	}
	
    @Test
    public void shouldCheckOfChrome() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "chrome" );
        Assertions.assertEquals( BrowserManagerEnum.CHROME, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof ChromeDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof ChromeDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
        
    }

}
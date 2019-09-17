package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class BrowserManagerEnumFirefox {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.FIREFOX);
	}
	
    @Test
    public void shouldCheckOfFirefox() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "firefox" );
        Assertions.assertEquals( BrowserManagerEnum.FIREFOX, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
}
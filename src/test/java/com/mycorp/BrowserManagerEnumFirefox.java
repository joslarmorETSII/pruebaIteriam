package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

@DisplayName("Test navegador Firefox")
public class BrowserManagerEnumFirefox {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.FIREFOX);
	}
	
    @Test
    @DisplayName("Obtener driver Firefox")
    public void shouldCheckOfFirefox() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "firefox" );
        Assertions.assertEquals( BrowserManagerEnum.FIREFOX, of );
        
    }
    
    @Test
    @DisplayName("Obtener manager Firefox")
    public void checkManagerBrowserFirefox() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "firefox" );
        Assertions.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
}
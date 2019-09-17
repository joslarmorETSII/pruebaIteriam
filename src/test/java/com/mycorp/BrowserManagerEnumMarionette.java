package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

@DisplayName("Test navegador Marionette")
public class BrowserManagerEnumMarionette {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.FIREFOX);
	}
	
    @Test
    @DisplayName("Obtener driver Marionette")
    public void shouldCheckOfMarionette() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "marionette" );
        Assertions.assertEquals( BrowserManagerEnum.MARIONETTE, of );
    }
    
    @Test
    @DisplayName("Obtener manager Marionette")
    public void checkManagerBrowserMarionette() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "marionette" );
        Assertions.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
}
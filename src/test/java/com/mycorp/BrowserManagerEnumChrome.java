package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

@DisplayName("Test navegador Chrome")
public class BrowserManagerEnumChrome {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.CHROME);
	}
	
    @Test
	@DisplayName("Obtener driver Chrome")
    public void shouldCheckOfChrome() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "chrome" );
        Assertions.assertEquals( BrowserManagerEnum.CHROME, of );
       
        
    }
    
    @Test
    @DisplayName("Obtener manager Chrome")
    public void checkManagerBrowserChrome() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "chrome" );
        Assertions.assertTrue( of.getBrowserManager() instanceof ChromeDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof ChromeDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }

}
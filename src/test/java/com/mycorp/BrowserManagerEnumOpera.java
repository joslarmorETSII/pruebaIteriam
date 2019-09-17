package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.OperaDriverManager;

@DisplayName("Test navegador Opera")
public class BrowserManagerEnumOpera {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.CHROME);
	}
	
	@Test
    @DisplayName("Obtener driver Opera")
    public void shouldCheckOfOpera() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "opera" );
        Assertions.assertEquals( BrowserManagerEnum.OPERA, of );
    }
	
	@Test
    @DisplayName("Obtener manager Opera")
    public void checkManagerBrowserOpera() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "opera" );
        Assertions.assertTrue( of.getBrowserManager() instanceof OperaDriverManager);
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof OperaDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
}
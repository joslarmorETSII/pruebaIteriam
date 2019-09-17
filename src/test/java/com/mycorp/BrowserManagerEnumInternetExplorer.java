package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

@DisplayName("Test navegador Internet explorer")
public class BrowserManagerEnumInternetExplorer {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.IE);
	}
	
    @Test
    @DisplayName("Obtener driver Internet explorer")
    public void shouldCheckOfIE() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "ie" );
        Assertions.assertEquals( BrowserManagerEnum.IE, of );
    }
    
    @Test
    @DisplayName("Obtener manager Internet explorer")
    public void checkManagerBrowserIE() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "ie" );
        Assertions.assertTrue( of.getBrowserManager() instanceof InternetExplorerDriverManager);
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof InternetExplorerDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
}
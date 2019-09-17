package com.mycorp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.EdgeDriverManager;

@DisplayName("Test navegador Edge")
public class BrowserManagerEnumEdge {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.IE);
	}
	
	@Test
	@DisplayName("Obtener driver Edge")
    public void shouldCheckOfEdge() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "edge" );
        Assertions.assertEquals( BrowserManagerEnum.EDGE, of );
    }    
	
	@Test
    @DisplayName("Obtener manager Edge")
    public void checkManagerBrowserEdge() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "edge" );
        Assertions.assertTrue( of.getBrowserManager() instanceof EdgeDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof EdgeDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
}
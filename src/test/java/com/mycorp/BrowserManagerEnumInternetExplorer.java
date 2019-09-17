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
	
	private BrowserManagerEnum browserInternetExplorer;

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.IE);
		browserInternetExplorer = BrowserManagerEnum.IE;
	}
	
	@Test
    @DisplayName("Valor enumerado correcto")
    public void shouldCheckOf() throws Exception {
        Assertions.assertEquals( browserInternetExplorer, BrowserManagerEnum.of( "ie" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado incorrecto")
    public void shouldCheckOfIncorrect() throws Exception {
    	Assertions.assertNotEquals( browserInternetExplorer, BrowserManagerEnum.of( "perry" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado null")
    public void shouldCheckOfNull() throws Exception {
    	Assertions.assertNotEquals( browserInternetExplorer, BrowserManagerEnum.of( "null" ) );
    }
    
    @Test
    @DisplayName("Obtener manager sin parametro")
    public void checkManagerBrowserNONE() throws Exception {
        Assertions.assertTrue( browserInternetExplorer.getBrowserManager() instanceof InternetExplorerDriverManager );
    }
    
    @Test
    @DisplayName("Obtener manager con parametro")
    public void checkManagerBrowserNONEWithParameter() throws Exception {
        Assertions.assertTrue( browserInternetExplorer.getBrowserManager( "1" ) instanceof InternetExplorerDriverManager );
    }
    
    @Test
    @DisplayName("Obtener driver")
    public void checkDriverBrowserNONE() throws Exception {
        Assertions.assertTrue( browserInternetExplorer.getDriver() instanceof RemoteWebDriver );
    }
    
}
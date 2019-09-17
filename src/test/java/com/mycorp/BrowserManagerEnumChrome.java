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

	private BrowserManagerEnum browserChrome;
	
	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.CHROME);
		browserChrome = BrowserManagerEnum.CHROME;
	}
	
	@Test
    @DisplayName("Valor enumerado correcto")
    public void shouldCheckOf() throws Exception {
        Assertions.assertEquals( browserChrome, BrowserManagerEnum.of( "chrome" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado incorrecto")
    public void shouldCheckOfIncorrect() throws Exception {
    	Assertions.assertNotEquals( browserChrome, BrowserManagerEnum.of( "perry" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado null")
    public void shouldCheckOfNull() throws Exception {
    	Assertions.assertNotEquals( browserChrome, BrowserManagerEnum.of( "null" ) );
    }
    
    @Test
    @DisplayName("Obtener manager sin parametro")
    public void checkManagerBrowserNONE() throws Exception {
        Assertions.assertTrue( browserChrome.getBrowserManager() instanceof ChromeDriverManager );
    }
    
    @Test
    @DisplayName("Obtener manager con parametro")
    public void checkManagerBrowserNONEWithParameter() throws Exception {
        Assertions.assertTrue( browserChrome.getBrowserManager( "1" ) instanceof ChromeDriverManager );
    }
    
    @Test
    @DisplayName("Obtener driver")
    public void checkDriverBrowserNONE() throws Exception {
        Assertions.assertTrue( browserChrome.getDriver() instanceof RemoteWebDriver );
    }

}
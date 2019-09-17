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

	private BrowserManagerEnum browserFirefox;
	
	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.FIREFOX);
		browserFirefox = BrowserManagerEnum.FIREFOX;
	}
	
	@Test
    @DisplayName("Valor enumerado correcto")
    public void shouldCheckOf() throws Exception {
        Assertions.assertEquals( browserFirefox, BrowserManagerEnum.of( "firefox" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado incorrecto")
    public void shouldCheckOfIncorrect() throws Exception {
    	Assertions.assertNotEquals( browserFirefox, BrowserManagerEnum.of( "perry" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado null")
    public void shouldCheckOfNull() throws Exception {
    	Assertions.assertNotEquals( browserFirefox, BrowserManagerEnum.of( "null" ) );
    }
    
    @Test
    @DisplayName("Obtener manager sin parametro")
    public void checkManagerBrowserNONE() throws Exception {
        Assertions.assertTrue( browserFirefox.getBrowserManager() instanceof FirefoxDriverManager );
    }
    
    @Test
    @DisplayName("Obtener manager con parametro")
    public void checkManagerBrowserNONEWithParameter() throws Exception {
        Assertions.assertTrue( browserFirefox.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
    }
    
    @Test
    @DisplayName("Obtener driver")
    public void checkDriverBrowserNONE() throws Exception {
        Assertions.assertTrue( browserFirefox.getDriver() instanceof RemoteWebDriver );
    }
    
}
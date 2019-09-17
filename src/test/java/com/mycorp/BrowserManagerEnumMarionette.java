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

	private BrowserManagerEnum browserMarionette;
	
	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.FIREFOX);
		browserMarionette = BrowserManagerEnum.MARIONETTE;
	}
	
	@Test
    @DisplayName("Valor enumerado correcto")
    public void shouldCheckOf() throws Exception {
        Assertions.assertEquals( browserMarionette, BrowserManagerEnum.of( "marionette" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado incorrecto")
    public void shouldCheckOfIncorrect() throws Exception {
    	Assertions.assertNotEquals( browserMarionette, BrowserManagerEnum.of( "perry" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado null")
    public void shouldCheckOfNull() throws Exception {
    	Assertions.assertNotEquals( browserMarionette, BrowserManagerEnum.of( "null" ) );
    }
    
    @Test
    @DisplayName("Obtener manager sin parametro")
    public void checkManagerBrowserNONE() throws Exception {
        Assertions.assertTrue( browserMarionette.getBrowserManager() instanceof FirefoxDriverManager );
    }
    
    @Test
    @DisplayName("Obtener manager con parametro")
    public void checkManagerBrowserNONEWithParameter() throws Exception {
        Assertions.assertTrue( browserMarionette.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
    }
    
    @Test
    @DisplayName("Obtener driver")
    public void checkDriverBrowserNONE() throws Exception {
        Assertions.assertTrue( browserMarionette.getDriver() instanceof RemoteWebDriver );
    }
    
}
package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.VoidDriverManager;

@DisplayName("Test navegador NONE")
public class BrowserManagerEnumTest {
	
	private BrowserManagerEnum browserNone;
	
	@BeforeEach
	private void inicilizarVariables() {
		browserNone = BrowserManagerEnum.NONE;
	}
	
    @Test
    @DisplayName("Valor enumerado correcto")
    public void shouldCheckOf() throws Exception {
        Assertions.assertEquals( browserNone, BrowserManagerEnum.of( "test" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado incorrecto")
    public void shouldCheckOfIncorrect() throws Exception {
    	Assertions.assertEquals( browserNone, BrowserManagerEnum.of( "perry" ) );
    }
    
    @Test
    @DisplayName("Valor enumerado null")
    public void shouldCheckOfNull() throws Exception {
    	Assertions.assertEquals( browserNone, BrowserManagerEnum.of( "null" ) );
    }
    
    @Test
    @DisplayName("Obtener manager sin parametro")
    public void checkManagerBrowserNONE() throws Exception {
        Assertions.assertTrue( browserNone.getBrowserManager() instanceof VoidDriverManager );
    }
    
    @Test
    @DisplayName("Obtener manager con parametro")
    public void checkManagerBrowserNONEWithParameter() throws Exception {
        Assertions.assertTrue( browserNone.getBrowserManager( "1" ) instanceof VoidDriverManager );
    }
    
    @Test
    @DisplayName("Obtener driver")
    public void checkDriverBrowserNONE() throws Exception {
        Assertions.assertTrue( browserNone.getDriver() instanceof RemoteWebDriver );
    }
}
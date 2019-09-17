package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.VoidDriverManager;

@DisplayName("Test navegador NONE")
public class BrowserManagerEnumTest {
	
    @Test
    @DisplayName("Obtener driver NONE")
    public void shouldCheckOf() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( null );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
    }
    
    @Test
    @DisplayName("Obtener manager NONE")
    public void checkManagerBrowserNONE() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertTrue( of.getBrowserManager() instanceof VoidDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof VoidDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
}
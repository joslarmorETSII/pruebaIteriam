package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.VoidDriverManager;

public class BrowserManagerEnumTest {
	
    @Test
    public void shouldCheckOf() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( null );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof VoidDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof VoidDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
}
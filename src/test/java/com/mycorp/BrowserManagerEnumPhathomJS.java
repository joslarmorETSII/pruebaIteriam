package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;

public class BrowserManagerEnumPhathomJS {

	@BeforeEach
	public void configSystem() {
		UtilsWebDriver.configureSystem(BrowserManagerEnum.CHROME);
	}
	
    @Test
    public void shouldCheckOfPhanthon() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "phantomjs" );
        Assertions.assertEquals( BrowserManagerEnum.PHANTOMJS, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof PhantomJsDriverManager);
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof PhantomJsDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
}
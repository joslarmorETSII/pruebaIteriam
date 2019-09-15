package com.mycorp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.VoidDriverManager;


/**
 * Unit test for simple BrowserManagerEnumTest.
 */
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

    @Test
    public void shouldCheckOfChrome() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "chrome" );
        Assertions.assertEquals( BrowserManagerEnum.CHROME, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof ChromeDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof ChromeDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }

    @Test
    public void shouldCheckOfFirefox() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "firefox" );
        Assertions.assertEquals( BrowserManagerEnum.FIREFOX, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
    @Test
    public void shouldCheckOfFirefoxMarionette() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "marionette" );
        Assertions.assertEquals( BrowserManagerEnum.MARIONETTE, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof FirefoxDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
    @Test
    public void shouldCheckOfEdge() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "edge" );
        Assertions.assertEquals( BrowserManagerEnum.EDGE, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof EdgeDriverManager );
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof EdgeDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
    @Test
    public void shouldCheckOfIE() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "ie" );
        Assertions.assertEquals( BrowserManagerEnum.IE, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof InternetExplorerDriverManager);
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof InternetExplorerDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
    }
    
    @Test
    public void shouldCheckOfOpera() throws Exception {
        BrowserManagerEnum of = BrowserManagerEnum.of( "test" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "perry" );
        Assertions.assertEquals( BrowserManagerEnum.NONE, of );
        of = BrowserManagerEnum.of( "opera" );
        Assertions.assertEquals( BrowserManagerEnum.OPERA, of );
        Assertions.assertTrue( of.getBrowserManager() instanceof OperaDriverManager);
        Assertions.assertTrue( of.getBrowserManager( "1" ) instanceof OperaDriverManager );
        Assertions.assertTrue( of.getDriver() instanceof RemoteWebDriver );
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

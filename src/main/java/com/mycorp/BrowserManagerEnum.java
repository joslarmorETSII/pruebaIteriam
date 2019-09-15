package com.mycorp;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.mycorp.utils.UtilsWebDriver;

import io.github.bonigarcia.wdm.BrowserManager;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.VoidDriverManager;


public enum BrowserManagerEnum {

    CHROME( "chrome" ),
    FIREFOX( "firefox" ),
    EDGE( "edge" ),
    IE( "ie" ),
    MARIONETTE( "marionette" ),
    OPERA( "opera" ),
    PHANTOMJS( "phantomjs" ),
    NONE( "test" );

    private final String browserName;

    private BrowserManagerEnum( final String browserName ) {
        this.browserName = browserName;
    }

    public static BrowserManagerEnum of( final String browserName ) {
        final String lBrowserName = StringUtils.lowerCase( browserName );
        for( final BrowserManagerEnum browser : BrowserManagerEnum.values() ) {
            if( browser.browserName.equals( lBrowserName ) ) {
                return browser;
            }
        }
        return NONE;
    }

    public BrowserManager getBrowserManager() {
        switch( this ) {
        case CHROME:        return ChromeDriverManager.getInstance().version( "2.24" );
        case FIREFOX:       return FirefoxDriverManager.getInstance();
        case EDGE:          return EdgeDriverManager.getInstance();
        case IE:            return InternetExplorerDriverManager.getInstance();
        case MARIONETTE:    return FirefoxDriverManager.getInstance();
        case OPERA:         return OperaDriverManager.getInstance();
        case PHANTOMJS:     return PhantomJsDriverManager.getInstance();
        case NONE: default: return VoidDriverManager.getInstance().version( "1" );
        }
    }

    public BrowserManager getBrowserManager( final String version ) {
        return getBrowserManager().version( version );
    }

    public WebDriver getDriver() {
    	
        final DesiredCapabilities dc = new DesiredCapabilities( BrowserType.MOCK, "mock-version", Platform.ANY );

        switch( this ) {
        case CHROME			: return UtilsWebDriver.getWebDriverByBrowser(this, dc);
        case FIREFOX		: return UtilsWebDriver.getWebDriverByBrowser(this, dc);
        case EDGE			: return new EdgeDriver();
        case IE				: return new InternetExplorerDriver();
        case MARIONETTE		: return new FirefoxDriver();
        case OPERA			: return new OperaDriver();
        case PHANTOMJS		: return new PhantomJSDriver();
        case NONE: default	: return UtilsWebDriver.getWebDriverByBrowser(this, dc);
            
        }
    }

}

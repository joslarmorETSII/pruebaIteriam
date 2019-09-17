package com.mycorp.utils;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;

import com.mycorp.BrowserManagerEnum;

public class UtilsWebDriver {
	
	final static File driverChrome = new File("drivers/chromedriver.exe");
	final static File driverGecko  = new File("drivers/geckodriver.exe");
	final static File driverEdge  = new File("drivers/msedgedriver.exe");
	
	public static WebDriver getWebDriverByBrowser(BrowserManagerEnum browser, DesiredCapabilities  dc) {
		
		//Debido a que Opera y PhantomJS esta basado en Chronium, utliza el mismo driver que Chrome, al igual que pasa con Edge e IE
		switch (browser) {
		case CHROME:
			return getChromeDriver(dc);
		case FIREFOX:
			return getFirefoxDriver(dc);
		case EDGE:
			return getEdgeDriver(dc);
		case IE:
			return getEdgeDriver(dc);
		case MARIONETTE:
			return getFirefoxDriver(dc);
		case OPERA:
			return getChromeDriver(dc);
		case PHANTOMJS:
			return getChromeDriver(dc);
		default:
			return getRemoteDriver(dc);
		}
	}
	
	public static void configureSystem(BrowserManagerEnum browser) {
		
		switch (browser) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", driverChrome.getAbsolutePath());
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", driverGecko.getAbsolutePath());
			break;
		case IE:
			System.setProperty("webdriver.edge.driver", driverEdge.getAbsolutePath());
			break;
		default:
			break;
		}
	}
	
	private static ChromeDriver getChromeDriver(DesiredCapabilities dc) {
		final ChromeDriver mock = new ChromeDriver( dc ) {
            @Override
            protected Response execute( final String driverCommand, final Map< String, ? > parameters ) {
                return new Response();
            }
            @Override
            protected void startSession( final Capabilities desiredCapabilities, final Capabilities requiredCapabilities ) {
                setSessionId( "mock" );
            }
        };
		return mock;
	}
	
	private static RemoteWebDriver getRemoteDriver(DesiredCapabilities dc) {
		final RemoteWebDriver mock = new RemoteWebDriver( dc ) {
            @Override
            protected Response execute( final String driverCommand, final Map< String, ? > parameters ) {
                return new Response();
            }
            @Override
            protected void startSession( final Capabilities desiredCapabilities, final Capabilities requiredCapabilities ) {
                setSessionId( "mock" );
            }
        };
        return mock;
	}
	
	private static FirefoxDriver getFirefoxDriver(DesiredCapabilities dc) {
		
		FirefoxBinary binary = new FirefoxBinary(driverGecko);
		FirefoxProfile profile = new FirefoxProfile();
		dc.setCapability("marionette", true);
		final FirefoxDriver mock = new FirefoxDriver(binary, profile, dc) {
            @Override
            protected Response execute( final String driverCommand, final Map< String, ? > parameters ) {
                return new Response();
            }
            @Override
            protected void startSession( final Capabilities desiredCapabilities, final Capabilities requiredCapabilities ) {
                setSessionId( "mock" );
            }
        };
		return mock;
	}
	
	private static EdgeDriver getEdgeDriver(DesiredCapabilities dc) {
		
		final EdgeDriver mock = new EdgeDriver(dc) {
            @Override
            protected Response execute( final String driverCommand, final Map< String, ? > parameters ) {
                return new Response();
            }
            @Override
            protected void startSession( final Capabilities desiredCapabilities, final Capabilities requiredCapabilities ) {
                setSessionId( "mock" );
            }
        };
		return mock;
	}
}
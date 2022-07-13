package com.adactin;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	 public static WebDriver driver;
	   //1.browserlaunch
	   public static WebDriver getBrowser(String type) {
		   
		   if (type.equalsIgnoreCase("chrome")) {
			   System.setProperty("webdriver.chrome.driver",
				   		System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			        driver = new ChromeDriver(); 
			   
		}else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();		
		}
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   return driver;
	   
	   }
	   
	      //2.Get
	    
	      public static void geturl(String url) {
	    	  driver.get(url);
	      }

	      //3.sendkeys
	       public static void sendkeys(WebElement element,String value) {
	    	   element.sendKeys(value);
	       }

	       //4.gettitle
	       public static void getTitle() {
	    	   String title = driver.getTitle();
	    	   System.out.println(title);
	       }
	       
	       //5.currenturl
	       
	       public static void currenturl() {
	    	   String currentUrl = driver.getCurrentUrl();
	    	   System.out.println(currentUrl);
	     }
	       
	      // 6.close
	       public static void close() {
			driver.close();
		}
	       
	       //7.quit
	       public static void quit() {
	    	   driver.quit();
	       }
	       
	       //8.navigateto
	       
	       public static void NavTo(String url) {
	    	   
	    	   driver.navigate().to(url);
	       }
	       
	       //9.back
	       
	       public static void Back() {
	    	   
	    	   driver.navigate().back();
	       }
	     
	       //10.refresh
	       
	       public static void Refresh() {
	    	   
	    	   driver.navigate().refresh();
	    	   
	    	   
	       }
		
	       //11.forward
	       
	       public static void Forward() {
	    	   
	    	   driver.navigate().forward();
	       }
	       
	       //12.getText
	       
	       public static void getText(WebElement element) {
	    	   String text = element.getText();
	    	   System.out.println(text);
	       }
	       
	       //13.click
	       
		   public static void click(WebElement c) {
	    	   c.click();
	    	   
	    	   
		   }
		   
		   //14.clear
		   
		   public static void Clear(WebElement element) {
			  element.clear();
		   }
		   
		   //15.DropDown
		   
		   public static void select(WebElement element,String option, String value) {
			   Select s = new Select(element);
			   if (option.equalsIgnoreCase("value")) {
			    s.selectByValue(value);
				
			}else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			}else if (option.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}else if (option.equalsIgnoreCase("getoption")) {
				List<WebElement> options = s.getOptions();
				for (WebElement web : options) {
					System.out.println(web.getText());
				}
			}else if (option.equalsIgnoreCase("ismultiple")) {
				boolean multiple = s.isMultiple();
				System.out.println("is this multipledropdown"+multiple);
			}else if (option.equalsIgnoreCase("getfirstselectedoption")) {
				WebElement selectedOption = s.getFirstSelectedOption();
				System.out.println(selectedOption);
			
			}else if(option.equalsIgnoreCase("allselectedoption")){
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				for (WebElement webElement : allSelectedOptions) {
					System.out.println(webElement.getText());
				}
			}
			   
		   }
		   
		   //16.isDisplayed
		   
		   public static void isDisplay(WebElement element) {
			   boolean displayed = element.isDisplayed();
			   System.out.println("Is the element is displayed"+displayed);
		   }
	    	 
          //17.isEnabled
		   
		   public static void isenable(WebElement element) {
			   boolean enabled = element.isEnabled();
			   System.out.println("Is the element is enabled"+enabled);
		   }
		   
          //18.isSelect
		   
		   public static void isselect(WebElement element) {
			   boolean selected = element.isSelected();
			   System.out.println("Is the element is selected"+selected);
		   }
	
	      //19.Alert
		   
		   public static void alert(String option) {
			   Alert alert = driver.switchTo().alert();
			   
			   if (option.equalsIgnoreCase("ok")) {
				alert.accept();
			}else if(option.equalsIgnoreCase("cancel")) {
				alert.dismiss();
			}else if(option.equalsIgnoreCase("gettext")) {
			   String text = alert.getText();
			   System.out.println(text);
			}
			   }
		   
          //20.actions
		   
		   public static void action(WebElement element,String option) {
			   
			Actions ac = new Actions(driver);
			   
			if (option.equalsIgnoreCase("move")) {
				ac.moveToElement(element).build().perform();
			}else if(option.equalsIgnoreCase("rytclick")) {
				ac.contextClick(element).build().perform();
			}else if(option.equalsIgnoreCase("dbclick")) {
				ac.doubleClick(element).build().perform();
			}else if(option.equalsIgnoreCase("hold")) {
				ac.clickAndHold(element).build().perform();
			}
			
		   }
		   
		  //21.screenshots
		   public static void Screenshot(String png) throws IOException {
		
		    TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Admin\\Workspace\\mavenproject\\Screenshot.png");
		    FileUtils.copyFile((File)source, des);
			 }
		   
          //22,Wait
		   
		   public static void wait(WebElement element,String option) {
			  if (option.equalsIgnoreCase("implicit")) {
			      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			  }else if(option.equalsIgnoreCase("explicity")) {
			      WebDriverWait Wait = new  WebDriverWait(driver,30); 
				
			  }else if(option.equalsIgnoreCase("visibleElement")) {
			      WebDriverWait Wait = new  WebDriverWait(driver,30); 
				   Wait.until(ExpectedConditions.visibilityOf(element));
			  }else if(option.equalsIgnoreCase("alertpresent")) {
			      WebDriverWait Wait = new  WebDriverWait(driver,30); 
			      Wait.until(ExpectedConditions.alertIsPresent());
			  }
			   
		      }
		     
		   //23.frames
		   
		   public static void frame(WebElement element) {
			   driver.switchTo().frame(element);
		   }

		   public static void exitframe() {
			   driver.switchTo().defaultContent();
		   }


		   //24.getAttributes
		   public static void getAttribute(WebElement element,String option) {
				  if (option.equalsIgnoreCase("value")) {
					String attribute = element.getAttribute("value");
					System.out.println(attribute);
				}else if(option.equalsIgnoreCase("name")) {
					String string = element.getAttribute("name");
					System.out.println(string);
				}	
		   }
		   
		   //25.javaScript
		   
		   public static void scroll(String value,String empty) {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript(value, "");
			   
		   }

		   public static void scrollIntoView(String view,WebElement element) {
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("arguments[0].scrollIntoView",element);
			   
		   }
}
	


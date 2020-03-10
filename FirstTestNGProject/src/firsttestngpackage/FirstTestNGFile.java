package firsttestngpackage;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class FirstTestNGFile {
  @Test
  public void f() {
      System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    //it will open the goggle page
    driver.get("http://localhost");
    //we expect the title ¡§Test title¡§ should be present
    String Expectedtitle = "Test title";
    //it will fetch the actual title
    String Actualtitle = driver.getTitle();
    System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
    //it will compare actual title and expected title
    Assert.assertEquals(Actualtitle, Expectedtitle);
    //print out the result
    System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
      
  }
}

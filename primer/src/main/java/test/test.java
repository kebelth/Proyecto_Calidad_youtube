package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static junit.framework.Assert.assertTrue;
public class test {


    public static void main(String[] args) throws InterruptedException {




        //prueba2

        By registerLinkLocator = By.linkText("ACCEDER");
        By registerPageLocator = By.id("logo");
        By registerPageLocator2 = By.id("logo");
        By usernameLocator = By.id("identifierId");
       By passwordLocator3 = By.name("password");
        By registerBtnLocator = By.id("identifierNext");
        By registerBtnLocator2 = By.id("passwordNext");




         // prueba3
        By registerLinkLocator3 = By.linkText("Explorar");
        By explorarPageLocator = By.id("destination-content-root");
        By tendeciasBtnLocator = By.id("destination-content-root");
        By videoBtnLocator3 = By.linkText("SOY UNA NUTRIA \uD83E\uDDA6");



        //prueba 4
        By musicaLinkLocator4 = By.linkText("EminemMusic");




//prueba uno

        System.setProperty("webdriver.chrome.driver", "./src//main/resources/drivers/chromedriver.exe");
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Open
        driver.get("https://www.youtube.com/");
        // Maximize browser
        driver.manage().window().maximize();






            String text01 = "Texto Prueba 01";

            WebElement searchbox = driver.findElement(By.name("search_query"));
            searchbox.sendKeys(text01);

           // searchbox.clear();
            searchbox.submit();

            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

            //validar

            String titulo = driver.getTitle();

            assertTrue("Valida el titulo", titulo.contains(text01));









/*
 prueba02
        System.setProperty("webdriver.chrome.driver", "./src//main/resources/drivers/chromedriver.exe");
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Open
        driver.get("https://www.youtube.com/");

        //driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S839848706%3A1660243998955743&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Des-419%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&ec=65620&hl=es-419&passive=true&service=youtube&uilel=3&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmWD7MOTbcmAv6vw1os2XIsB-enuHftLtOSOKLp3ZBr_fhl-HbOP2pWFIdmpzn491FYIN83gcQ/");
        // Maximize browser
        driver.manage().window().maximize();



        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);

        if(driver.findElement(registerPageLocator).isDisplayed()){
            driver.findElement(usernameLocator).sendKeys("test0101U@gmail.com");
            driver.findElement(registerBtnLocator).click();
            Thread.sleep(2000);

           // while (driver.findElement(registerPageLocator2).isDisplayed()){
                driver.findElement(passwordLocator3).sendKeys("3017816624");
                driver.findElement(registerBtnLocator2).click();
            //}



        }
        else {
            System.out.print("Register pages was not found");
        }


*/




/*
        //prueba 3 explorar

        System.setProperty("webdriver.chrome.driver", "./src//main/resources/drivers/chromedriver.exe");
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Open
        driver.get("https://www.youtube.com/");

        // Maximize browser
        driver.manage().window().maximize();

        driver.findElement(registerLinkLocator3).click();
        Thread.sleep(2000);



        if(driver.findElement(explorarPageLocator).isDisplayed()) {
            driver.findElement(tendeciasBtnLocator).click();
            Thread.sleep(2000);


            driver.findElement(videoBtnLocator3).click();

        }

*/


/*
        //prueba 4 3 puntos

        System.setProperty("webdriver.chrome.driver", "./src//main/resources/drivers/chromedriver.exe");
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Open
        driver.get("https://www.youtube.com/");

        //driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S839848706%3A1660243998955743&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Des-419%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&ec=65620&hl=es-419&passive=true&service=youtube&uilel=3&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmWD7MOTbcmAv6vw1os2XIsB-enuHftLtOSOKLp3ZBr_fhl-HbOP2pWFIdmpzn491FYIN83gcQ/");
        // Maximize browser
        driver.manage().window().maximize();



        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);

        if(driver.findElement(registerPageLocator).isDisplayed()){
            driver.findElement(usernameLocator).sendKeys("test0101U@gmail.com");
            driver.findElement(registerBtnLocator).click();
            Thread.sleep(2000);


            driver.findElement(passwordLocator3).sendKeys("3017816624");
            driver.findElement(registerBtnLocator2).click();



        }
        else {
            System.out.print("Register pages was not found");
        }


*/






    }








}
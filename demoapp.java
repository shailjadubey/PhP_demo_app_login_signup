import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoapp {

	public static Object driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//demoapp d=new demoapp();
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailja.dubey\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  //Launching google
	  driver.get("https://www.google.com");
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  //Maximize window;
	  driver.manage().window().maximize();
	  driver.get("https://www.phptravels.net/login");//open demo app
	  WebElement cookies=driver.findElement(By.id("cookie_stop"));
	cookies.sendKeys(Keys.ENTER);//click on cookies messsage box
	 Thread.sleep(1000);
	 js.executeScript("window.scrollBy(0,50)");//window scroll
	 //dASHBOARDMODULE.dash(driver);
	 System.out.println("enter 1.for login && 2.For signup");
	 Scanner s =new Scanner(System.in);
	 int aa,j=1;
	 //float phoneno;
	 String nameinput,nameinput2,phoneno,emailid,password1;
	 aa=s.nextInt();
	 if (aa==1) {
    WebElement username=driver.findElement(By.xpath("//input[@placeholder='Email']"));
    username.sendKeys("user@phptravels.com");//input username
    WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
    password.sendKeys("demouser");//input password
    WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"));
	button.sendKeys(Keys.ENTER);//login button
	dash(driver);
	 }
	 else// if user want to sign in
	 {
		 //Serching sign up button and click
	WebElement signupbutton=driver.findElement(By.xpath("//a[@class='btn btn-outline-primary btn-block form-group effect ladda-sm ladda-button waves-effect']"));
	signupbutton.sendKeys(Keys.ENTER);
	System.out.println("Title of page-" +driver.getTitle());//verify title of page
	System.out.println("enter 1st name");
	//taking user input for 1st name
	nameinput=s.next();
	System.out.println("Enter last name");
	nameinput2=s.next();
	System.out.println("enter phone number");
	phoneno=s.next();
	System.out.println("Enter mail id");
	emailid=s.next();
	System.out.println("enter password");
	password1=s.next();
	WebElement name=driver.findElement(By.xpath("//input[@name='first_name']"));
	name.sendKeys(nameinput);
	//Printing 1st name in respective field
	Thread.sleep(3000);
	WebElement name2=driver.findElement(By.xpath("//input[@name='last_name']"));
	name2.sendKeys(nameinput2);//printing lastname
	WebElement number=driver.findElement(By.xpath("//input[@name='phone']"));
	number.sendKeys(phoneno);//printing phone number
	js.executeScript("window.scrollBy(0,100)");//scroll window
	WebElement mail=driver.findElement(By.xpath("//input[@name='email']"));
	mail.sendKeys(emailid);//printning emailid
	WebElement pw=driver.findElement(By.xpath("//input[@name='password']"));
	pw.sendKeys(password1);
	js.executeScript("window.scrollBy(0,50)");
	/*WebElement type=driver.findElement(By.id("select2-account_type-container"));
	Select sel=new Select(type);
	List<WebElement> m=sel.getAllSelectedOptions();
	System.out.println("Select type from following options-");
	for(int i=0;i<m.size();i++)
	{
		System.out.println(m.get(i).getText());
	} 
	
	System.out.println("Enter type- 1.Customer 2.Supplier 3.Agent");
	j=s.nextInt();
	if(j == 1)
	{
		sel.selectByVisibleText("Customer");
	}
	else if(j==2)
	{
		sel.selectByVisibleText("Supplier");
	}
	else
	{
		sel.selectByVisibleText("Agent");
	}*/
WebElement sbutton=	driver.findElement(By.xpath("//button[@type='submit']"));
	sbutton.sendKeys(Keys.ENTER);
	dash(driver);
	 }
	}
	public static void dash(WebDriver driver) {
		//TODO Auto-generated method stub
	System.out.println("title of page is-"+driver.getTitle()); //printing title of page
	//testing for title of page
	String title=driver.getTitle();
	 String a="Dashboard - PHPTRAVELS";
	if(title.equals(a))
	 {
		 System.out.println("Test case 1 pass");
	}
	 else
	{
		System.out.println("Bug");
	}
	 }
	}	


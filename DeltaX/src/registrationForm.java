import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registrationForm {

//*********************//////////////////////////////////////////////****************************//	
	
	@Test(priority=4)
	//TC-4Verify first name is mandatory
	public static void FirstNameCheck() throws InterruptedException {
		ChromeDriver driver = null;
		try {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adjiva.com/qa-test/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/button")).click();
		Thread.sleep(3000);
		String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"Please enter your First Name");
		}catch (Exception e) {
			
			e.printStackTrace();
		}finally{
		driver.quit();
		}
	}
	
	
	//******************//////////////////////////////////////////////////****************************//
	
	@Test(priority=1)
	//TC-1Verify the minimum and maximum length length of first name field
	
	public static void MaxMinFirstNameCheck() throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = null;
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adjiva.com/qa-test/");
		Thread.sleep(3000);
		
		//for min value
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("A");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
		String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"This value is not valid");
		
		//for max value
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
		String Msg1=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"This value is not valid");
}catch (Exception e) {
			
			e.printStackTrace();
		}finally{
		driver.quit();
		}
		
	}
	
	//******************///////////////////////////////////////////////********************//
	//TC-2Verify First name field should not accept input other than alphabets
	@Test(priority=2)
	
	public static void InvalidinputFirstName() throws InterruptedException {
    ChromeDriver driver = null;
	try {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://adjiva.com/qa-test/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("&&&&@@@@@@***");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
	String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText();
	System.out.println(Msg);
	Thread.sleep(3000);
	Assert.assertEquals(Msg,"This value is not valid");
	}catch (Exception e) {
		
		e.printStackTrace();
	}finally{
	driver.quit();
	}
	}
	
	
	//********************/////////////////////////////////*****************************
	//TC-3Verify first name field should not accept space as character.
	@Test(priority=3)
	
	public static void FirstNameSpace() throws InterruptedException {
		ChromeDriver driver = null;
	    try {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adjiva.com/qa-test/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("      ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
		String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"This value is not valid");
}catch (Exception e) {
			
			e.printStackTrace();
		}finally{
		driver.quit();
		}
	}
	
	
	//TC-7Verify last name field is mandatory.
	@Test(priority=7)
	public static void LastNameCheck() throws InterruptedException {
		ChromeDriver driver = null;
	    try {
		driver=new ChromeDriver();
		driver.get("http://adjiva.com/qa-test/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/button")).click();
		Thread.sleep(3000);
		String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"Please enter your Last Name");
        }catch (Exception e) {
			
			e.printStackTrace();
		}finally{
		driver.quit();
		
	}
	}
	
	
	//************************////////////////////////////*****************************//
	
	@Test(priority=5)
	//TC-5Verify the minimum and maximum length of Last name field
	
	public static void MaxMinLastNameCheck() throws InterruptedException {
		
	
		        ChromeDriver driver = null;
		        try {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("http://adjiva.com/qa-test/");
				Thread.sleep(3000);
				
				//for min value
				driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("A");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
				String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText();
				System.out.println(Msg);
				Assert.assertEquals(Msg,"This value is not valid");
				
				//for max value
				driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
				String Msg1=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText();
				System.out.println(Msg);
				Assert.assertEquals(Msg,"This value is not valid");
		        }catch (Exception e) {
					
					e.printStackTrace();
				}finally{
				driver.quit();
				}
	}
	
	//******************///////////////////////////////////////////////********************//
		//TC-6Verify Last name field should not accept input other than alphabets
		@Test(priority=6)
		
		public static void InvalidinputLastName() throws InterruptedException {
			ChromeDriver driver = null;
			try {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://adjiva.com/qa-test/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("&&&&@@@@@@***");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
		String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"This value is not valid");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
		driver.quit();
			}
		
		}
	
		//TC-7Verify Last name field should not accept space as character.
		@Test(priority=7)
		
		public static void LastNameSpace() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("      ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[1]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"This value is not valid");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			
			}
		}
		
		//**********************////////////////////////////////////*********************
	
	
	//TC-9Verify that user is able to select Department.
	@Test(priority=9)
	public static void SelectDept() throws InterruptedException{
		ChromeDriver driver = null;
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adjiva.com/qa-test/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/select")).sendKeys("Marketing");
		Thread.sleep(5000);
		String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/select")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"Marketing");
        }catch (Exception e) {
			
			e.printStackTrace();
		}finally{
		driver.quit();
		
	}}
	//**********************///////////////////////////////////////***********************
	
 
   //TC-10Verify the department field is optional
   @Test(priority=10)
   public static void SelectDeptoptional() throws InterruptedException{
	  
	   ChromeDriver driver = null;
	   try {
	   System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adjiva.com/qa-test/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Acsah");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Mathew");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("acsahmathew");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("Test1234");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Test1234");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/input")).sendKeys("acsahmathew17@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("9140797730");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/button")).click();
		Thread.sleep(9000);
		String Msg=driver.findElement(By.xpath("/html/body/div/form/fieldset/legend/center/h2/b")).getText();
		System.out.println(Msg);
		Assert.assertEquals(Msg,"Thanks");
	   }catch (Exception e) {
			
			e.printStackTrace();
		}finally{
		driver.quit();
		}
		
	}
   
   
   
	
	//TC-11Verify the minimum and maximum length for username field.
		@Test(priority=11)
		public static void MaxMinUsername() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			
			//for min value
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("A");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"This value is not valid");
			
			//for max value
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			String Msg1=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"This value is not valid");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			 
			driver.quit();
			}
			
		}
		
		
		//TC-12Verify the validation of username field.
		@Test(priority=12)
		public static void ValidationUsername() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("         ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"Space and \".\" is allowed as input in username field.");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			}
			
		}
		
		//TC-13Verify username field is mandatory
		@Test(priority=13)
		
		public static void MandateUsername() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"Please enter your Username");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			}
			
		}
		
		//TC-15Verify the input length of password field
		@Test(priority=15)
		public static void InputLenPassowrd() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("1234567");
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[1]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"This value is not valid");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			}
		}
		
		//TC-16Verify the validation of password field
		@Test(priority=16)
		public static void ValPassowrd() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("12345678");
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"Password must contain atleast one capital letter,number,one special character.");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			}
		}
		
		//TC-17Verify password field is mandatory.
		@Test(priority=17)
		public static void MandatePassword() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"Please enter your Password");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			}
		}
		
		//TC-18Verify password field does not accept space as character
		@Test(priority=18)
		public static void SpacePassword() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("     ");
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"Please enter your Password");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			}
		}
		
		//TC-20Verify error is shown when user enters invalid input in confirm password
		@Test(priority=19)
		
		public static void ConfirmPassword() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("abcd1234");
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("abcd12345");
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"Password and confirm password should be same");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
			}
		}
		
		//TC-22Verify the format of email id is valid
		@Test(priority=20)
		public static void FormatemailID() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/input")).sendKeys("abcd1234");
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"This value is not valid");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
				driver.quit();
			}
			
		}
		
		//TC-23Verify that email id field is mandatory
		
		@Test(priority=21)
		public static void MandatemailID() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"Please enter your Email Address");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			
			driver.quit();
			}
		}
		
		//TC-24Verify the validation of contact number
		
		@Test(priority=22)
		public static void ValNumber() throws InterruptedException {
			ChromeDriver driver = null;
			try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://adjiva.com/qa-test/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).click();
			driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("3233333333");
			String Msg=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[2]")).getText();
			System.out.println(Msg);
			Assert.assertEquals(Msg,"This value is not valid");
			}catch (Exception e) {
				
				e.printStackTrace();
			}finally{
			driver.quit();
		
		}
		}
	}
		
			
	
		
		
		
		
		
		
		

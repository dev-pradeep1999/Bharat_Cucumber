//package Bharat_cucumber;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class bharatlabstepdef {
//	public WebDriver driver;
//
//	@Given("User Launch Chrome browser")
//	public void user_launch_chrome_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("http://155.248.241.228:7300");
//	}
//
//	@When("user enters Facility Code, UserName and Password")
//	public void user_enters_facility_code_as_user_name_as_and_password_as() {
//		driver.findElement(By.id("facility")).sendKeys("bharatlab");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("demo123");
//		driver.findElement(By.xpath("//*[@id=\"example4\"]/div/div/div/div/div/div/form/div[5]/input")).click();
//
//	}
//
//	@And("invalid username and enters invalid Facility Code, UserName and Password")
//	public void inuser_enters_facility_code_as_user_name_as_and_password_as() {
//		driver.findElement(By.id("facility")).sendKeys("bharatlab");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("demo1235");
//		driver.findElement(By.xpath("//*[@id=\"example4\"]/div/div/div/div/div/div/form/div[5]/input")).click();
//
//	}
//
//	@Then("close browsers")
//	public void close_browser() throws Exception {
//		Thread.sleep(2000);
//		driver.quit();
//
//	}
//
//	@Then("user is enter the valid patient name, contact, LABUID and HospitalId")
//	public void user_is_enter_the_valid_patient_name_contact_labuid_and_hospital_id() throws Exception {
//		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("sumit");
//		driver.findElement(By.xpath("//*[@id=\"contact\"]")).sendKeys("8523856974");
//		driver.findElement(By.xpath("//*[@id=\"uhid\"]")).sendKeys("8523996");
//		driver.findElement(By.xpath("//*[@id=\"nic_uhid\"]")).sendKeys("UHID102563");
//		driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
//
//		Thread.sleep(2000);
//	}
//
//	@Then("browser close ")
//	public void closeBrowser() {
//		driver.quit();
//	}
//}

package Bharat_cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bharatlab {
	WebDriver driver;

	// Browser Launch
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.navigate().to("http://155.248.241.228:7300");

	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	// Login
	@When("user enters Facility Code as {string}, UserName as {string} and Password as {string}")
	public void user_enters_facility_code_as_user_name_as_and_password_as(String Facility, String UserName,
			String Password) {
		driver.findElement(By.id("facility")).sendKeys(Facility);
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"example4\"]/div/div/div/div/div/div/form/div[5]/input")).click();

	}

	@Then("the user clicks on Add Patient button")
	public void theUserClicksOnAddPatientButton() {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[1]/table/thead/tr[1]/th[3]/h3/a"))
				.click();
	}

	// Add patient details
	@When("the user enters the patient details")
	public void theUserEntersPatientDetails(DataTable usertable) throws Exception {
		List<Map<String, String>> user = usertable.asMaps(String.class, String.class);

		Select Tdropdown = new Select(
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[1]/select")));
		Tdropdown.selectByVisibleText("Dr");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[2]/input"))
				.sendKeys(user.get(0).get("First Name"));
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[3]/input"))
				.sendKeys(user.get(0).get("Middle Name"));
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[4]/input"))
				.sendKeys(user.get(0).get("Last Name"));
		Select Gdropdown = new Select(
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[5]/select")));
		Gdropdown.selectByVisibleText("Male");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[6]/div/input[1]"))
				.sendKeys("22");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[6]/div/input[2]"))
				.sendKeys("5");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[6]/div/input[3]"))
				.sendKeys("3");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[8]/input"))
				.sendKeys(user.get(0).get("Mobile"));
		Select Rdropdown = new Select(
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[9]/select")));
		Rdropdown.selectByVisibleText("C/o");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[10]/input"))
				.sendKeys(user.get(0).get("Emergency Contact Name"));
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[11]/input"))
				.sendKeys(user.get(0).get("Emergency Contact Number"));
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[14]/input"))
				.sendKeys(user.get(0).get("Village / Ward"));
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[17]/input"))
				.sendKeys(user.get(0).get("Hospital UHID"));
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[3]/div[18]/input"))
				.sendKeys(user.get(0).get("Aadhaar No."));
		// driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]/button[2]")).click();
	}

	// Select test from test master
	@Then("user select the test from drop-down as {string} , {string} , {string} and {string}")
	public void user_select_the_test_from_drop_down(String firsttest, String secondtest, String thirdtest,
			String fourthtest) {
		driver.findElement(By.xpath("//*[@id=\"dropdownMenu2\"]/span")).click();
		// System.out.println("Add the test");
		WebElement add_test = driver.findElement(By.xpath("//*[@id=\"searchtest\"]"));
		// kadd_test.sendKeys("LIVER FUNCTION TEST" + Keys.TAB + Keys.SPACE);
		add_test.sendKeys(firsttest + Keys.TAB + Keys.SPACE);
		add_test.sendKeys(secondtest + Keys.TAB + Keys.SPACE);
		add_test.sendKeys(thirdtest + Keys.TAB + Keys.SPACE);
		add_test.sendKeys(fourthtest + Keys.TAB + Keys.SPACE);

	}

	@Then("user enter the visit type as {string}")
	public void user_enter_the_visit_type(String visittype) {
		driver.findElement(By.xpath("//*[@id=\"opd-ipd\"]")).sendKeys(visittype);

	}

	@Then("user click on save and generate button")
	public void user_click_on_save_and_generate_button() {
		driver.findElement(By.xpath("//*[@id=\"save_button\"]")).click();
	}

	// test barcode

	@Then("user enter the test barcode as {string}, {string}, and {string}")

	public void user_enter_the_test_barcode(String firsttestbarcode, String secondtestbarcode,
			String thirdtestbarcode) {
		driver.findElement(By.xpath("//*[@id=\"sampleCollect\"]/table/tbody/tr[1]/td[2]/input[2]"))
				.sendKeys(firsttestbarcode);
		driver.findElement(By.xpath("//*[@id=\"sampleCollect\"]/table/tbody/tr[2]/td[2]/input[2]"))
				.sendKeys(secondtestbarcode);
		driver.findElement(By.xpath("//*[@id=\"sampleCollect\"]/table/tbody/tr[3]/td[2]/input[2]"))
				.sendKeys(thirdtestbarcode);
		// driver.findElement(
		// By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/form/table/tbody/tr[4]/td[2]/input[2]"))
		// .sendKeys("26236142498132");
	}

	@Then("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div[2]/button")).click();
	}

	@Then("user click on back button")
	public void click_on_back_button() {
		driver.findElement(By.xpath("//*[@id=\"clickMeId\"]/a")).click();

	}

	@Then("user click on print console left panel button")
	public void user_click_on_print_console_left_panel_button() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/ul/li[2]/a/span")).click();

	}

	// Search Functionality Print console
	// search funcationality on the basis of start and end date

	@Then("user select the start date as {string}")
	public void user_select_the_start_date_as(String startdate) {
		driver.findElement(By.xpath("//*[@id=\"starts_at\"]")).sendKeys(startdate);

	}

	@Then("user select the end date as {string}")
	public void user_select_the_end_date(String enddate) {
		driver.findElement(By.xpath("//*[@id=\"ends_at\"]")).sendKeys(enddate);
	}

	@Then("user enter the order Number as {string}")
	public void user_enter_the_order_Number(String orderno) {
		driver.findElement(By.xpath("//*[@id=\"orderNo\"]")).sendKeys(orderno);
	}

	@Then("user enter the lab number as {string}")
	public void user_enter_the_lab_number(String labno) {
		driver.findElement(By.xpath("//*[@id=\"labNo\"]")).sendKeys(labno);

	}

	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[5]/a")).click();
		Thread.sleep(2000);
	}

	@Then("user select the patient type")
	public void user_select_the_patient_type() {
		Select ptyperopdown = new Select(
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[2]/div[1]/select")));
		ptyperopdown.selectByVisibleText("COMMON");
	}

	@Then("user select the visit type")
	public void user_select_the_visit_type() throws Exception {
		Select vtypedropdown = new Select(
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[2]/div[2]/select")));
		Thread.sleep(2000);
		vtypedropdown.selectByVisibleText("OPD");
	}

	@Then("user is select the ward")
	public void user_is_select_the_ward() {
		Select wardropdown = new Select(
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[2]/div[3]/select")));
		wardropdown.selectByVisibleText("PRIVATE");
	}

	@Then("close browser")
	public void closeBrowser() {
		driver.quit();
	}

	@Then("user click on lab work left panel menu")
	public void user_click_on_lab_work_left_panel_menu() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/ul/li[4]/a/span")).click();
	}

	@Then("user click on sample collection work list")
	public void user_click_on_sample_collection_work_list() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sample Collection Work List")).click();
	}

	@Then("user select the start date as {string}, end date as {string} , orderNo as {string}, labNo as {string} and firstname as {string}")
	public void user_select_the_start_date_and_end_date(String startd, String endd, String orderNum, String labnum,
			String pfname) {
		driver.findElement(By.xpath("//*[@id=\"starts_at\"]")).sendKeys(startd);
		driver.findElement(By.xpath("//*[@id=\"ends_at\"]")).sendKeys(endd);
		driver.findElement(By.xpath("//*[@id=\"orderNo\"]")).sendKeys(orderNum);
		driver.findElement(By.xpath("//*[@id=\"labNo\"]")).sendKeys(labnum);
		driver.findElement(By.xpath("//*[@id=\"pFirstName\"]")).sendKeys(pfname);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div[6]/a")).click();
	}

// verify the lab work Sample collection functionality
	@Then("user click on Collection sample button")
	public void user_click_on_Collection_sample_icon() throws InterruptedException {
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"names\"]/tr[1]/td[12]/i")).click();
		Thread.sleep(2000);
		System.out.println("handle :" + originalWindow);
		driver.findElement(By.xpath("//*[@id=\"bd-example-modal-lg-SampleCollection\"]/div/form/div/div[3]/button"))
				.click();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(originalWindow);
		System.out.println("enter main window:------>" + originalWindow);
		driver.findElement(
				By.xpath("//*[@id=\"bd-example-modal-lg-SampleCollection\"]/div/form/div/div[1]/button/span")).click();
		System.out.println("main window-------->");
	}

	@Then("user click on print barcode button")
	public void user_click_on_print_barcode_button_icon() throws InterruptedException {
		Thread.sleep(1000);
		String originalWindow = driver.getWindowHandle();
		System.out.println("Barcode print");
		driver.findElement(By.xpath("//*[@id=\"names\"]/tr/td[12]/a[1]/i")).click();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				System.out.println("Scroll down-123--");
			}
		}
		String originalWindows = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"sampleCollect\"]/div/button")).click();
		System.out.println("sumit checking.......");
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindows.contentEquals(windowHandle)) {
				System.out.println("abc checking..............Thread sleep is woirkng.....");
				Thread.sleep(2000);
				System.out.println("abc checking...................");
				driver.findElement(By.xpath("//*[@id=\"hide2\"]/span/a")).click();
				driver.switchTo().window(windowHandle);
				System.out.println("abc checking...................jlkjl");
			}
		}
	}

	@Then("user click on lab work left panel menu2")
	public void user_click_on_lab_work_left_panel_menu2() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/ul/li[4]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/ul[2]/li[2]/a/span")).click();
		System.out.println("hellooooooo............................................");
//		driver.findElement(By.xpath(""));
	}

	@Then("user select the start date as {string}, end date as {string} , orderNo as {string}, labNo as {string} and barcode as {string}")
	public void user_select_the_start_date_as_end_date_as_order_no_as_lab_no_as_and_barcode_as(String startdate,
			String enddate, String orderNo, String labNo, String barcodeNo) {
		driver.findElement(By.xpath("//*[@id=\"starts_at\"]")).sendKeys(startdate);
		System.out.println("hellooooooo............................................");
		driver.findElement(By.xpath("//*[@id=\"ends_at\"]")).sendKeys(enddate);
		driver.findElement(By.xpath("//*[@id=\"orderNo\"]")).sendKeys(orderNo);
		driver.findElement(By.xpath("//*[@id=\"labNo\"]")).sendKeys(labNo);
		driver.findElement(By.xpath("//*[@id=\"barcodeNo\"]")).sendKeys(barcodeNo);
	}

	@Then("click on search button")
	public void click_on_search_button() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div[6]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"getcolorclick136\"]/td[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"0\"]")).sendKeys("12");
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/div/div[3]/div[5]/div[2]/div/form/div[1]/div[1]/div/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("14");
		Select tdropdown = new Select(driver.findElement(By.xpath(
				"/html/body/div[3]/div/div/div[3]/div[5]/div[2]/div/form/div[2]/div[1]/div/table/tbody/tr[1]/td[2]/select")));
		tdropdown.selectByVisibleText("A");
		Select tedropdown = new Select(driver.findElement(By.xpath(
				"/html/body/div[3]/div/div/div[3]/div[5]/div[2]/div/form/div[2]/div[1]/div/table/tbody/tr[2]/td[2]/select")));
		tedropdown.selectByVisibleText("Positive");
		driver.findElement(By.xpath("//*[@id=\"resultSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"chkAllbox\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"authorizetest\"]")).click();
	}

}

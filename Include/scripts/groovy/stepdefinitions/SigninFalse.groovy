package stepdefinitions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SigninFalse {
	@Given("User navigates to the homepage")
	def navigateToHomenPage() {
		println ("\n I am inside HomePage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.vergency.vn/')
	}
	@And("User click on the item account")
	def clickonItemlog() {
		WebUI.click(findTestObject('Object Repository/Page_Ca hng qun o.  Vergency/svg_Toggle navigation_svg-next-icon svg-nex_fd1658 (3)'))
	}
	@When("User navigates to  login page")
	def nagivgateToLoginpage() {
		WebUI.click(findTestObject('Object Repository/Page_Ti khon  Vergency/li_ng nhp'))
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Ti khon  Vergency/span_ng nhp (1)'), 'Đăng nhập')
	}
	@And("Click on SigninText")
	def clickSiginText() {

		WebUI.click(findTestObject('Object Repository/Page_Ti khon  Vergency/a_ng k (2)'))
		WebUI.click(findTestObject('Object Repository/Page_To ti khon  Vergency/li_ng k'))
		WebUI.verifyElementText(findTestObject('Object Repository/Page_To ti khon  Vergency/span_ng k'), 'Ðăng ký')
	}


	@When("User inputs the following credentials: ho (.*), ten (.*), email (.*), and password (.*)")
	public void enterrCredentials(String ho, String ten, String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerlast_name (2)'), ho);
		WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerfirst_name (2)'), ten);
		WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customeremail'), email);
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerpassword (2)'), password);
	}
	@And("Click on signin btn")
	def clickonSigninbtn() {
		println ("\n I am click on Signin Button")
		WebUI.click(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_btn (1)'))
	}
	@Then("Verify text")
	def verifytext1() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_To ti khon  Vergency/li_Email  tn ti. Nu bn qun mt khu, bn c th _48cf7e (1)'),
				'Email đã tồn tại. Nếu bạn quên mật khẩu, bạn có thể thiết lập lại mật khẩu tại đây.')

		WebUI.closeBrowser()
	}
}
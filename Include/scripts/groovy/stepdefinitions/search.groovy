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

import java.awt.Robot
import java.awt.event.KeyEvent

class search {
	@Given("User navigates to the Home Page")
	def navigateHompage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.vergency.vn/')
	}
	@When("User click on item Search")
	def clickItemSearch() {
		WebUI.click(findTestObject('Object Repository/search/Page_Ca hng qun o.  Vergency/svg_Toggle navigation_svg-next-icon svg-nex_fd1658'))
	}
	@And("User input (.*)")
	def inputsearchtext(String search) {
		WebUI.setText(findTestObject('Object Repository/search/Page_Ca hng qun o.  Vergency/input_Toggle navigation_q'), search)
		def robot = new Robot()
		Thread.sleep(1000)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
	}
	@Then("Verify info")
	def verifyInfo() {
		WebUI.click(findTestObject('Object Repository/search/Page_Kt qu tm kim t - Vergency/span_Tm kim'))
		WebUI.verifyElementText(findTestObject('Object Repository/search/Page_Kt qu tm kim t - Vergency/span_Tm kim'), 'Tìm kiếm')
		WebUI.closeBrowser()
	}
}
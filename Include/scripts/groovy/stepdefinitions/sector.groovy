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
import java.util.logging.Logger
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



class sector {
	@Given("User navigates to Homepage")
//	def navigateToHomepage() {
//		WebUI.openBrowser('')
//		WebUI.navigateToUrl('https://www.vergency.vn/')
//	}
	def navigateToHomepage() {
		Logger logger = new Logger()
		logger.logInfo("Mở trình duyệt")
		WebUI.openBrowser('')
		logger.logInfo("Điều hướng đến URL")
		WebUI.navigateToUrl('https://www.vergency.vn/')
		logger.logInfo("Hoàn thành điều hướng")
	}
	@When("User click on the SHOP")
	def clickShop() {
		WebUI.click(findTestObject('Object Repository/Sectors/Page_Ca hng qun o.  Vergency/a_SHOP'))
	}

	@And("User navigates to category page")
	def navigatesCategoryPage() {
		WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_Tt c sn phm  Vergency/span_Tt c sn phm'), 'Tất cả sản phẩm')
	}
	def TSHIRTS="WebUI.click(findTestObject('Object Repository/Sectors/Page_T-SHIRTS  Vergency/a_T-SHIRTS'))"
	@When("Click on chose sector product and Verify info")
	def chooseSectorAndVerify() {

		if (WebUI.click(findTestObject('Object Repository/Sectors/Page_Tt c sn phm  Vergency/a_T-SHIRTS'))) {
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_T-SHIRTS  Vergency/span_T-SHIRTS'), 'T-SHIRTS');
		} else if (WebUI.click(findTestObject('Object Repository/Sectors/Page_T-SHIRTS  Vergency/a_SHIRTS'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_SHIRTS  Vergency/span_SHIRTS'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_SHIRTS  Vergency/span_SHIRTS'), 'SHIRTS');
		} else if (WebUI.click(findTestObject('Object Repository/Sectors/Page_SHIRTS  Vergency/a_SWEATERS'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_SWEATERS  Vergency/span_SWEATERS'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_SWEATERS  Vergency/span_SWEATERS'), 'SWEATERS');
		} else if ( WebUI.click(findTestObject('Object Repository/Sectors/Page_SWEATERS  Vergency/a_HOODIES'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_HOODIES  Vergency/span_HOODIES'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_HOODIES  Vergency/span_HOODIES'), 'HOODIES');
		} else if ( WebUI.click(findTestObject('Object Repository/Sectors/Page_HOODIES  Vergency/a_SHORTS'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_SHORTS  Vergency/span_SHORTS'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_SHORTS  Vergency/span_SHORTS'), 'SHORTS');
		} else if (WebUI.click(findTestObject('Object Repository/Sectors/Page_SHORTS  Vergency/a_PERFUME'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_PERFUME  Vergency/span_PERFUME'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_PERFUME  Vergency/span_PERFUME'), 'PERFUME');
		} else if (WebUI.click(findTestObject('Object Repository/Sectors/Page_PERFUME  Vergency/a_JACKET'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_JACKET  Vergency/span_JACKET'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_JACKET  Vergency/span_JACKET'), 'JACKET');
		} else if (WebUI.click(findTestObject('Object Repository/Sectors/Page_JACKET  Vergency/a_ACCESSORIES'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_ACCESSORIES  Vergency/span_ACCESSORIES'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_ACCESSORIES  Vergency/span_ACCESSORIES'), 'ACCESSORIES');
		} else if ( WebUI.click(findTestObject('Object Repository/Sectors/Page_ACCESSORIES  Vergency/a_POLO'))) {
			WebUI.click(findTestObject('Object Repository/Sectors/Page_POLO  Vergency/li_POLO'));
			WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_POLO  Vergency/span_POLO'), 'POLO');
		} else  ( WebUI.click(findTestObject('Object Repository/Sectors/Page_POLO  Vergency/a_PANTS'))) {
				WebUI.click(findTestObject('Object Repository/Sectors/Page_PANTS  Vergency/span_PANTS'));
				WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_PANTS  Vergency/span_PANTS'), 'PANTS');
			}
	}
}
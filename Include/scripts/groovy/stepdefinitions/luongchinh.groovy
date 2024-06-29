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
import com.kms.katalon.core.webui.common.WebUiCommonHelper

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

import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class luongchinh {

	@Given("User navigates to HomePage")
	def navigatestoHomePage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.vergency.vn/')
	}
	@When("User click on ItemAccount")
	def clickItemAcc() {

		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ca hng qun o.  Vergency/svg_Toggle navigation_svg-next-icon svg-nex_fd1658'))
	}
	@And("User navigates to the loginpage")
	def navigatestoLoginPage() {
		WebUI.click(findTestObject('Object Repository/Page_Ti khon  Vergency/h1_ng nhp (1) (1)'))
	}
	@When("Input (.*) and (.*) to Logiform")
	def inputLoginform(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/input_ng nhp_customeremail'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/input_ng nhp_customerpassword'),
				password)
	}
	@When("Click on Login btn")
	def clickLoginbtn() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/input_ng nhp_btn btn-signin'))
	}
	@Then("User navigates to the account page")
	def navigatestoAccPage() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/a_Ti khon'))

		WebUI.verifyElementText(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/a_Ti khon'), 'Tài khoản')
	}
	@When("User click on button home")
	def clickBtnHome() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/a_HOME'))
	}
	@When("User Click on product")
	def Clickonproduct() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ca hng qun o.  Vergency/img_giy_dt-width-100 ls-is-cached lazyloaded'))
	}
	@And("User click chose size of product")
	def choosesize() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Simple T-ShirtCream  Vergency/label_XL'))
	}
	@When("User click on button add to cart")
	def addcart() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Simple T-ShirtCream  Vergency/span_Thm vo gi'))
	}
	@And("User click on see cart")
	def seecart() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Simple T-ShirtCream  Vergency/a_XEM GI HNG'))
	}
	@Then("User navigates to the cart page")
	def navigatestoCartpage() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Gi hng ca bn - Vergency/span_Gi hng'))

		WebUI.verifyElementText(findTestObject('Object Repository/luongchinh/Page_Gi hng ca bn - Vergency/span_Gi hng'), 'Giỏ hàng')
	}
	@When("User click on Paybtn")
	def clickonPaybtn() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Gi hng ca bn - Vergency/a_Thanh ton'))
	}
	@Then("User navigates to OrderForm")
	def navigatestoOrderForm() {
		WebUI.click(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/h2_Thng tin giao hng'))

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/h2_Thng tin giao hng'), 'Thông tin giao hàng')
	}
	@When("User Input (.*), (.*) and (.*) to OrderForm")
	def inputOrderForm(String hoten, String sdt, String diachi) {
		WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/input_H v tn_billing_addressfull_name'), hoten)
		WebUI.setText(findTestObject('Object Repository/addcart/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), sdt)
		WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), diachi)
		WebUI.selectOptionByValue(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70 (1)'),
				'21', false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70 (1)'),
				'21', false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c (1)'),
				'759', false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c (1)'),
				'759', false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95 (1)'),
				'12103', false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95 (1)'),
				'12103', false)
	}
	@And("User click on CompleteForm")
	def CompleteForm() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/button_Hon tt n hng'))
	}
	@Then("Verify Notification")
	def VerifyNotification() {
		WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - n hng484662/h2_t hng thnh cng'))

		WebUI.verifyElementText(findTestObject('Object Repository/luongchinh/Page_Vergency - n hng484662/h2_t hng thnh cng'), 'Đặt hàng thành công')
	}
}
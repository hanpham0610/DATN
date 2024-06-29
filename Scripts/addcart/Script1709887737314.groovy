import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.vergency.vn/')

WebUI.click(findTestObject('Object Repository/addcart/Page_Ca hng qun o.  Vergency/img_440,000_dt-width-100 lazyloaded'))

WebUI.click(findTestObject('Object Repository/addcart/Page_Shizu Donna T-ShirtBlack  Vergency/label_XL'))

WebUI.click(findTestObject('Object Repository/addcart/Page_Shizu Donna T-ShirtBlack  Vergency/span_Thm vo gi_icon_cart_btn'))

WebUI.click(findTestObject('Object Repository/addcart/Page_Gi hng ca bn - Vergency/a_Thanh ton'))

WebUI.setText(findTestObject('Object Repository/addcart/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '0848772443')

WebUI.setText(findTestObject('Object Repository/addcart/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 
    '')

WebUI.click(findTestObject('Object Repository/addcart/Page_Vergency - Thanh ton n hng/div_S in thoi_order-checkout__loading--box show'))

WebUI.closeBrowser()


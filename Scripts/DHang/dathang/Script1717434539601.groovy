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

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Ca hng qun o.  Vergency/svg_Toggle navigation_svg-next-icon svg-nex_fd1658'))

WebUI.setText(findTestObject('Object Repository/Dathnag/Page_Ti khon  Vergency/input_ng nhp_customeremail'), 'sakurakiss102@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Dathnag/Page_Ti khon  Vergency/input_ng nhp_customerpassword'), 
    '4ybX0yEUURQGlglqMZvhTw==')

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Ti khon  Vergency/input_ng nhp_btn btn-signin'))

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Ti khon  Vergency/a_HOME'))

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Ca hng qun o.  Vergency/h2_Simple T-ShirtCream'))

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Simple T-ShirtCream  Vergency/label_XL'))

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Simple T-ShirtCream  Vergency/span_Thm vo gi'))

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Simple T-ShirtCream  Vergency/a_XEM GI HNG'))

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Gi hng ca bn - Vergency/a_Thanh ton'))

WebUI.setText(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/input_H v tn_billing_addressfull_name'), 
    'Phạm Thị Hân')

WebUI.setText(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '')

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/div_S in thoi_order-checkout__loading--box show'))

WebUI.setText(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '0846773225')

WebUI.setText(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 
    '')

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/div_S in thoi_order-checkout__loading--box show'))

WebUI.setText(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 
    'Ân Thi-Hưng Yên')

WebUI.selectOptionByValue(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    'null', true)

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/div_S in thoi_order-checkout__loading--box show'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    '58', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn An BinHuyn An Minh_62538c'), 
    '627', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn G QuaoX Thi QunX T_6122d5'), 
    '30970', true)

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Vergency - Thanh ton n hng/i_Hon tt n hng_btn-spinner icon icon-button_7dcd92'))

WebUI.click(findTestObject('Object Repository/Dathnag/Page_Vergency - n hng485080/h2_t hng thnh cng'))

WebUI.verifyElementText(findTestObject('Object Repository/Dathnag/Page_Vergency - n hng485080/h2_t hng thnh cng'), 'Đặt hàng thành công')

WebUI.closeBrowser()


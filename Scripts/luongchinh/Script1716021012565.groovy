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

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ca hng qun o.  Vergency/svg_Toggle navigation_svg-next-icon svg-nex_fd1658'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/h1_ng nhp'))

WebUI.verifyElementText(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/h1_ng nhp'), 'Đăng nhập')

WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/input_ng nhp_customeremail'), 'sakurakiss102@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/input_ng nhp_customerpassword'), 
    '4ybX0yEUURQGlglqMZvhTw==')

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/input_ng nhp_btn btn-signin'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/a_Ti khon'))

WebUI.verifyElementText(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/a_Ti khon'), 'Tài khoản')

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ti khon  Vergency/a_HOME'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Ca hng qun o.  Vergency/img_giy_dt-width-100 ls-is-cached lazyloaded'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Simple T-ShirtCream  Vergency/label_XL'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Simple T-ShirtCream  Vergency/span_Thm vo gi'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Simple T-ShirtCream  Vergency/a_XEM GI HNG'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Gi hng ca bn - Vergency/span_Gi hng'))

WebUI.verifyElementText(findTestObject('Object Repository/luongchinh/Page_Gi hng ca bn - Vergency/span_Gi hng'), 'Giỏ hàng')

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Gi hng ca bn - Vergency/a_Thanh ton'))

WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/input_H v tn_billing_addressfull_name'), 
    'Pham Thi Han')

WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '')

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/div_S in thoi_order-checkout__loading--box show'))

WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '0848663223')

WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 
    '')

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/div_S in thoi_order-checkout__loading--box show'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/body_VergencyHin th thng tin n hngn thng ti_8a30c0'))

WebUI.setText(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 
    'My Hao-Hung Yen')

WebUI.selectOptionByValue(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    'null', true)

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/div_S in thoi_order-checkout__loading--box show'))

WebUI.selectOptionByValue(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c'), 
    '759', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c'), 
    '759', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95'), 
    '12103', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95'), 
    '12103', true)

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - Thanh ton n hng/button_Hon tt n hng'))

WebUI.click(findTestObject('Object Repository/luongchinh/Page_Vergency - n hng484662/h2_t hng thnh cng'))

WebUI.verifyElementText(findTestObject('Object Repository/luongchinh/Page_Vergency - n hng484662/h2_t hng thnh cng'), 'Đặt hàng thành công')


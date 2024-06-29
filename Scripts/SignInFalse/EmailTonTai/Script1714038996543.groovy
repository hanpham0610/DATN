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

WebUI.click(findTestObject('Object Repository/Page_Ca hng qun o.  Vergency/svg_Toggle navigation_svg-next-icon svg-nex_fd1658 (3)'))

WebUI.click(findTestObject('Object Repository/Page_Ti khon  Vergency/li_ng nhp'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ti khon  Vergency/span_ng nhp (1)'), 'Đăng nhập')

WebUI.click(findTestObject('Object Repository/Page_Ti khon  Vergency/a_ng k (2)'))

WebUI.click(findTestObject('Object Repository/Page_To ti khon  Vergency/li_ng k'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_To ti khon  Vergency/span_ng k'), 'Ðăng ký')

WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerlast_name (2)'), 'pham')

WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerfirst_name (2)'), 'han')

WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customeremail'), 'sakurakiss102@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerpassword (2)'), '4ybX0yEUURQGlglqMZvhTw==')

WebUI.click(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_btn (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_To ti khon  Vergency/li_Email  tn ti. Nu bn qun mt khu, bn c th _48cf7e (1)'), 
    'Email đã tồn tại. Nếu bạn quên mật khẩu, bạn có thể thiết lập lại mật khẩu tại đây.')

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/Page_Ca hng qun o.  Vergency/use (2)'))

WebUI.click(findTestObject('Object Repository/Page_Ti khon  Vergency/a_ng k (1)'))

WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerlast_name (1)'), 'Han')

WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerfirst_name (1)'), 'Pham')

WebUI.setText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customeremail (1)'), 'pthan0101@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_To ti khon  Vergency/input_ng k_customerpassword (1)'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Page_To ti khon  Vergency/input_Mt khu qu ngn (ti thiu 5 k t)_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_To ti khon  Vergency/li_Mt khu qu ngn (ti thiu 5 k t)'), 
    'Mật khẩu quá ngắn (tối thiểu 5 ký tự).')

WebUI.closeBrowser()


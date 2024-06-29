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

WebUI.navigateToUrl('https://www.vergency.vn/products/simple-t-shirt-cream')

WebUI.click(findTestObject('Object Repository/DH/Page_Simple T-ShirtCream  Vergency/label_XL (1)'))

WebUI.click(findTestObject('Object Repository/DH/Page_Simple T-ShirtCream  Vergency/button_Mua ngay'))

WebUI.click(findTestObject('Object Repository/DH/Page_Gi hng ca bn - Vergency/a_Thanh ton (1)'))

WebUI.setText(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/input_H v tn_billing_addressfull_name'), 
    'gsfs')

WebUI.setText(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/input_Email_checkout_useremail'), '')

WebUI.setText(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/input_Email_checkout_useremail'), 'fsf@ngn.com')

WebUI.setText(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '')

WebUI.setText(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '0843776826')

WebUI.setText(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/DH/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1 (1)'), 
    'hyhhhhh')

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


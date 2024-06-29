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

WebUI.click(findTestObject('Object Repository/donhang/Page_Ca hng qun o.  Vergency/img_giy_dt-width-100 lazyloaded'))

WebUI.click(findTestObject('Object Repository/donhang/Page_Simple T-ShirtCream  Vergency/label_XL'))

WebUI.click(findTestObject('Object Repository/donhang/Page_Simple T-ShirtCream  Vergency/span_Mua ngay'))

WebUI.click(findTestObject('Object Repository/donhang/Page_Gi hng ca bn - Vergency/a_Thanh ton'))

WebUI.setText(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/input_H v tn_billing_addressfull_name'), 
    'fsfdf')

WebUI.setText(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/input_Email_checkout_useremail'), 
    '')

WebUI.setText(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/input_Email_checkout_useremail'), 
    'dsd@fsfsf.com')

WebUI.setText(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '0849772663')

WebUI.setText(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 
    'as-aff-hungyen')

WebUI.selectOptionByValue(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c'), 
    '759', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c'), 
    '759', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95'), 
    '12103', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/donhang/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95'), 
    '12103', true)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.vergency.vn/')

WebUI.click(findTestObject('Object Repository/Page_Ca hng qun o.  Vergency/img_giy_dt-width-100 lazyloaded (1)'))

WebUI.click(findTestObject('Object Repository/Page_Simple T-ShirtCream  Vergency/label_XL (1)'))

WebUI.click(findTestObject('Object Repository/Page_Simple T-ShirtCream  Vergency/span_Mua ngay (1)'))

WebUI.click(findTestObject('Object Repository/Page_Gi hng ca bn - Vergency/a_Thanh ton (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/input_H v tn_billing_addressfull_name'), 
    'fsfdf')

WebUI.setText(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/input_Email_checkout_useremail'), '')

WebUI.setText(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/input_Email_checkout_useremail'), 'dsd@fsfsf.com')

WebUI.setText(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/input_S in thoi_billing_addressphone'), 
    '0849772663')

WebUI.setText(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 'as-aff-hungyen')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c'), 
    '759', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c'), 
    '759', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95'), 
    '12103', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95'), 
    '12103', true)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.vergency.vn/')

WebUI.click(findTestObject('Object Repository/Page_Ca hng qun o.  Vergency/h2_Simple T-ShirtCream'))

WebUI.click(findTestObject('Object Repository/Page_Simple T-ShirtCream  Vergency/label_XL (1)'))

WebUI.click(findTestObject('Object Repository/Page_Simple T-ShirtCream  Vergency/span_Thm vo gi_icon_cart_btn'))

WebUI.click(findTestObject('Object Repository/Page_Gi hng ca bn - Vergency/a_Thanh ton (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/input_a ch_billing_addressaddress1'), 'dadffsdf')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn tnh  thnh H Ch MinhH Ni NngAn Gi_3f3e70'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn qun  huynHuyn n ThiHuyn Chu Gian_e9c23c'), 
    '759', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vergency - Thanh ton n hng/select_Chn phng  xTh trn Bn Yn NhnX Bch Sam_6f2f95'), 
    '12103', true)


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

WebUI.click(findTestObject('Object Repository/Sectors/Page_Ca hng qun o.  Vergency/a_SHOP'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_Tt c sn phm  Vergency/span_Tt c sn phm'), 'Tất cả sản phẩm')

WebUI.click(findTestObject('Object Repository/Sectors/Page_Tt c sn phm  Vergency/a_T-SHIRTS'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_T-SHIRTS  Vergency/span_T-SHIRTS'), 'T-SHIRTS')

WebUI.click(findTestObject('Object Repository/Sectors/Page_T-SHIRTS  Vergency/a_SHIRTS'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_SHIRTS  Vergency/span_SHIRTS'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_SHIRTS  Vergency/span_SHIRTS'), 'SHIRTS')

WebUI.click(findTestObject('Object Repository/Sectors/Page_SHIRTS  Vergency/a_SWEATERS'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_SWEATERS  Vergency/span_SWEATERS'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_SWEATERS  Vergency/span_SWEATERS'), 'SWEATERS')

WebUI.click(findTestObject('Object Repository/Sectors/Page_SWEATERS  Vergency/a_HOODIES'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_HOODIES  Vergency/span_HOODIES'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_HOODIES  Vergency/span_HOODIES'), 'HOODIES')

WebUI.click(findTestObject('Object Repository/Sectors/Page_HOODIES  Vergency/a_SHORTS'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_SHORTS  Vergency/span_SHORTS'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_SHORTS  Vergency/span_SHORTS'), 'SHORTS')

WebUI.click(findTestObject('Object Repository/Sectors/Page_SHORTS  Vergency/a_PERFUME'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_PERFUME  Vergency/span_PERFUME'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_PERFUME  Vergency/span_PERFUME'), 'PERFUME')

WebUI.click(findTestObject('Object Repository/Sectors/Page_PERFUME  Vergency/a_JACKET'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_JACKET  Vergency/span_JACKET'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_JACKET  Vergency/span_JACKET'), 'JACKET')

WebUI.click(findTestObject('Object Repository/Sectors/Page_JACKET  Vergency/a_ACCESSORIES'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_ACCESSORIES  Vergency/span_ACCESSORIES'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_ACCESSORIES  Vergency/span_ACCESSORIES'), 'ACCESSORIES')

WebUI.click(findTestObject('Object Repository/Sectors/Page_ACCESSORIES  Vergency/a_POLO'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_POLO  Vergency/li_POLO'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_POLO  Vergency/span_POLO'), 'POLO')

WebUI.click(findTestObject('Object Repository/Sectors/Page_POLO  Vergency/a_PANTS'))

WebUI.click(findTestObject('Object Repository/Sectors/Page_PANTS  Vergency/span_PANTS'))

WebUI.verifyElementText(findTestObject('Object Repository/Sectors/Page_PANTS  Vergency/span_PANTS'), 'PANTS')


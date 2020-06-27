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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.sanibelsupply.eu/')

WebUI.click(findTestObject('Object Repository/advanced_search/Page_Sanibel Supply - Audiological disposables/span_OK'))

WebUI.click(findTestObject('Object Repository/advanced_search/Page_Sanibel Supply - Audiological disposables/a_Advanced search'))

WebUI.setText(findTestObject('Object Repository/advanced_search/Page_Sanibel Supply - Advanced Search/input_Product Name_name'), 
    'ambu')

WebUI.setText(findTestObject('Object Repository/advanced_search/Page_Sanibel Supply - Advanced Search/input_Item number_sku'), 
    '8504783')

WebUI.setText(findTestObject('Object Repository/advanced_search/Page_Sanibel Supply - Advanced Search/input_Description_description'), 
    'High quality Ag/AgCl sensor – ensures excellent trace quality.')

WebUI.setText(findTestObject('Object Repository/advanced_search/Page_Sanibel Supply - Advanced Search/input_Price_priceto'), 
    '20')

WebUI.click(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Advanced Search/span_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sanibel Supply - Advanced Search Results/li_Item number 8504783'), 
    'Item number: 8504783')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sanibel Supply - Advanced Search Results/div_1 item were found using the following s_43fd57 (1)'), 
    '1 item were found using the following search criteria', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(200, 250)

WebUI.takeScreenshot('Screenshots\\TC_8.1.png')

WebUI.closeBrowser()


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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://www.sanibelsupply.eu/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Audiological disposables/span_OK'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Audiological disposables/a_Advanced search'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Advanced Search/input_Product Name_name'), 
    'Sanibel™ disposable prewired electrodes 50cm, 300 pcs', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Advanced Search/span_Search'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/advanced_search/search/Page_Sanibel Supply - Advanced Search Results/div_1 item were found using the following s_43fd57'), 
    '1 item were found using the following search criteria', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Product Name: Sanibel™ disposable prewired electrodes 50cm, 300 pcs', false)

WebUI.takeScreenshot('Screenshots\\TC_8.8.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)


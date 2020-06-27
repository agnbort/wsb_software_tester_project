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

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.sanibelsupply.eu/', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Audiological disposables/span_OK'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Audiological disposables/a_Advanced search'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Advanced Search/input_Product Name_name'), 
    'Ambu® Blue Sensor™ P-00-S, bag/50 pcs', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/advanced_search_bledna_fraza/Page_Sanibel Supply - Advanced Search/span_Search'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('advanced_search_bledna_fraza/Page_Sanibel Supply - Advanced Search Results/div_We cant find any items matching these s_34dd9b'), 
    'We can\'t find any items matching these search criteria. Modify your search.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot('Screenshots\\TC_8.7.png', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


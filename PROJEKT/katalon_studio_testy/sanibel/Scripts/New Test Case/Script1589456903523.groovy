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

WebUI.openBrowser('https://www.sanibelsupply.eu/')

WebUI.click(findTestObject('advanced_search2/Page_Sanibel Supply - Audiological disposables/span_OK'))

WebUI.click(findTestObject('advanced_search2/Page_Sanibel Supply - Audiological disposables/a_Advanced search'))

WebUI.navigateToUrl('https://www.sanibelsupply.eu/catalogsearch/advanced')

WebUI.setText(findTestObject('advanced_search2/Page_Sanibel Supply - Advanced Search/input_Product Name_name'), 'szukam')

WebUI.click(findTestObject('advanced_search2/Page_Sanibel Supply - Advanced Search/button_Search'))

WebUI.verifyTextPresent('We can\'t find any items matching these search criteria. Modify your search.', false)

WebUI.closeBrowser()


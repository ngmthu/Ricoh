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

WebUI.openBrowser('https://www.knowledge-ra.com')

WebUI.navigateToUrl('https://www.knowledge-ra.com/login?returnUrl=%2F')

WebUI.setText(findTestObject('Page_Log in/username'), 'kiennt-rak')

WebUI.setText(findTestObject('Page_Log in/password'), 'b')

WebUI.click(findTestObject('Page_Log in/remember_Checkbox'))

WebUI.click(findTestObject('Page_Log in/login_btn'))

WebUI.click(findTestObject('Page_Home/blockquote'))

WebUI.verifyTextPresent('We develop innovative technologies aligned to the needs of our customers, because we’re committed to solving real-world needs for real customers through technology evolution.', 
    false)

WebUI.click(findTestObject('Page_Home/Title'))

WebUI.verifyTextPresent('Explore our Products and Solutions', false)

WebUI.click(findTestObject('Page_Home/Sub-title'))

WebUI.verifyTextPresent('Find the right customer solution', false)

WebUI.closeBrowser()


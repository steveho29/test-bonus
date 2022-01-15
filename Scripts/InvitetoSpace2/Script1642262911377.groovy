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

WebUI.navigateToUrl('http://127.0.0.1:8080/')

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element/div_Sign In'))

WebUI.setText(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element/input_Sign in with_username'), 
    'thien1510')

WebUI.setEncryptedText(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element/input_Username_password'), 
    'KZc6Zw4dZ8jytUnXvokUkA==')

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element/div_Verify with another device'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element/div_To proceed, please accept the verificat_b6efbc'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element/span_T'))

WebUI.rightClick(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element  thin11/span_T'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element  thin11/span_Invite'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element  thin11/h3_Invite people'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element  thin11/div_c H Ngc Minhminhducmatrix.org'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/Page_Element/Page_Element/Page_Element  thin11/div_Invite'))

WebUI.closeBrowser()


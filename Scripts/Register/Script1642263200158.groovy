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

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/div_Create Account'))

WebUI.setText(findTestObject('Object Repository/Createprivate_space/Page_Element/input_Or_mx_RegistrationForm_username'), 
    'thien123')

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Createprivate_space/Page_Element/input_Username_mx_RegistrationForm_password'), 
    'RURW9u9572uAPOc/kF08Ig==')

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/div_Create accountHost account onmatrix.org_6b4dd0'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/div_Confirm password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Createprivate_space/Page_Element/input_Password_mx_RegistrationForm_passwordConfirm'), 
    '8GLUgRTDV0iYWNDNm1ntpg==')

WebUI.setText(findTestObject('Object Repository/Createprivate_space/Page_Element/input_Confirm password_mx_Field_1'), 'ntthien19@clc.fitus.edu.vn')

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/input_Email_mx_Login_submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Createprivate_space/Page_Element/input_Password_mx_RegistrationForm_passwordConfirm'), 
    'RURW9u9572uAPOc/kF08Ig==')

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/input_Email_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/img_taxis_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/img_taxis_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/img_taxis_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/button_Verify'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/label_Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Createprivate_space/Page_Element/button_Accept'))

WebUI.closeBrowser()


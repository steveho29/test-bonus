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

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element/div_Sign In'))

WebUI.setText(findTestObject('Page 1/Page_Element/input_username'), 'thien1510')

WebUI.setEncryptedText(findTestObject('Object Repository/Page 1/Page_Element/input_password'), 'KZc6Zw4dZ8jytUnXvokUkA==')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element/login_button'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element/verify_button'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element/div_To proceed, please accept the verificat_b6efbc'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element/div_Verify_mx_SpaceButton_icon'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element/h3_Public'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element/input_Upload_spaceName'), 'thien2001')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element/create_space_button'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Add'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Mark as not suggested_mx_ContextualMenu_1c052e'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/invite_space_btn'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Invite peopleInvite with email or username'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien2001/input_share this space_focus-visible'), 'hnmduc19@clc.fitus.edu.vn')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/invite_space_btn'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Add'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/span_Create new room'))

WebUI.setText(findTestObject('Page_Element  thien2001/input__mx_Field_12'), 'thienduc')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/button_Create Room'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/span_thien1510 created and configured the room'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_hello world_mx_BasicMessageComposer_inp_fdd0f2'), 
    '<div style=""><br></div>')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Invite to just this room'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien1/input_share this room_focus-visible'), 'hnmduc19@clc.fitus.edu.vn')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Invite'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_hello world_mx_AccessibleButton mx_Mess_3eecbe'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_hello world_mx_AccessibleButton mx_Mess_2cab05'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_hello world_mx_AccessibleButton mx_Mess_c3da2d'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_hello world'), '<div style="">hello world !!!!</div>')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Save'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_(edited)_mx_AccessibleButton mx_Message_a632aa'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/span_Remove'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/button_Remove'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_thien1_mx_AccessibleButton mx_RightPane_31b4cb'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_thien1_mx_AccessibleButton mx_RoomHeade_69f70d'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien1/input_All Rooms_focus-visible'), 'hahaha')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_All Rooms_mx_AccessibleButton mx_Search_544a22'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Export chat'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/button_Export'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/button_OK'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Room settings'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_GeneralSecurity  PrivacyRoles  Permissi_f2bebd'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien1/input_General_mx_Field_16'), 'Thiện Và Đức')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Save'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Room Settings - Thin V c_mx_AccessibleB_0ff217'))

WebUI.rightClick(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_Add widgets, bridges  bots_mx_Contextua_1c16e5'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/div_thien2001'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien1/span_Manage  explore rooms'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Invite_mx_AccessibleButton mx_SpaceRoom_87964d'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_GeneralVisibilityRoles  PermissionsAdva_4cf9a9'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien2001/input_Upload_spaceName'), 'thienvaduc')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Save Changes'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Space settings_mx_AccessibleButton mx_D_37c948'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Add'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/span_Create new room'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thien2001/input_Create a room_mx_Field_24'), 'thien2')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Public room'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/div_Private room (invite only)'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thien2001/button_Create Room'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_thien2_mx_AccessibleButton mx_RoomHeade_d1e8c8'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/button_OK'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_thien2_mx_AccessibleButton mx_RightPane_9a7184'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_Room settings'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_T'), 'T')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Th'), 'Th')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thi'), 'Thi')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thie'), 'Thie')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thi'), 'Thi')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thi_1'), 'Thiê')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin'), 'Thiên')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thi_1'), 'Thiê')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thi'), 'Thi')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thi_1_2'), 'Thiệ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin_1'), 'Thiện')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin_1_2'), 'Thiện ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v'), 'Thiện v')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin va'), 'Thiện va')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v'), 'Thiện v')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1'), 'Thiện và')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2'), 'Thiện và ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v D'), 'Thiện và D')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2'), 'Thiện và ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2_3'), 'Thiện và Đ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v u'), 'Thiện và Đu')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v uc'), 'Thiện và Đuc')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v u'), 'Thiện và Đu')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2_3'), 'Thiện và Đ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2_3_4'), 'Thiện và Đư')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v c'), 'Thiện và Đưc')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2_3_4'), 'Thiện và Đư')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2_3'), 'Thiện và Đ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v_1_2_3_4_5'), 'Thiện và Đứ')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/textarea_Thin v c_1'), 'Thiện và Đức')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_Save'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_Room Settings - thien2_mx_AccessibleBut_5abade'))

WebUI.rightClick(findTestObject('Object Repository/Page 1/Page_Element  Empty room/span_T'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/span_Space'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  Empty room/input_Upload_spaceName'), 'thienvaduc')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_Public space'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_Private space (invite only)'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  Empty room/div_Add'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thienvaduc/h3_Me and my teammates'))

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thienvaduc/input_Room name_mx_AccessibleButton mx_Acce_a0c731'))

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thienvaduc/input_app.element.io_emailAddress0'), 'hnmduc19@clc.fitus.edu.vn')

WebUI.setText(findTestObject('Object Repository/Page 1/Page_Element  thienvaduc/input_Email address_emailAddress1'), 'hnmduc19@clc.fitus.edu.vn')

WebUI.click(findTestObject('Object Repository/Page 1/Page_Element  thienvaduc/div_Email address'))

WebUI.setText(findTestObject('Page_Element  thienvaduc/input_Email address_emailAddress2'), 'hnmduc19@clc.fitus.edu.vn')

WebUI.click(findTestObject('Page_Element  thienvaduc/input_Invite by username_mx_AccessibleButto_57a976'))


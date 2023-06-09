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

Mobile.startApplication(GlobalVariable.app, false)

Mobile.verifyElementVisible(findTestObject('pageRegister/btnCreateAccount'), 0)

Mobile.tap(findTestObject('pageRegister/btnCreateAccount'), 0)

Mobile.verifyElementVisible(findTestObject('pageRegister/inputName'), 0)

Mobile.setText(findTestObject('pageRegister/inputName'), GlobalVariable.name, 0)

Mobile.setText(findTestObject('pageRegister/inputEmail'), GlobalVariable.email, 0)

Mobile.setText(findTestObject('pageRegister/inputPassword'), GlobalVariable.password, 0)

Mobile.setText(findTestObject('pageRegister/inputConfirmPassword'), '', 0)

Mobile.verifyElementVisible(findTestObject('pageRegister/btnRegister'), 0)

Mobile.tap(findTestObject('pageRegister/btnRegister'), 0)

Mobile.verifyElementVisible(findTestObject('pageRegister/alertPasswordNotMatch'), 0)

Mobile.verifyElementAttributeValue(findTestObject('pageRegister/alertPasswordNotMatch'), 'text', 'Password Does Not Matches', 
    0)


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

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.tap(findTestObject('Menu Login/01 Button LOGIN'), 0)

Mobile.delay(1)

Mobile.tapAtPosition(531, 2040)

Mobile.delay(1)

Mobile.tap(findTestObject('Menu Login/02 Button - Login Dengan Password  Registrasi'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Menu Login/03 Input Password'), 'Bankmega1', 0)

Mobile.delay(1)

Mobile.takeScreenshot()

Mobile.delay(1)

Mobile.tap(findTestObject('Menu Login/04 Button - LOGIN'), 0)

Mobile.delay(1)

Mobile.takeScreenshot()

Mobile.delay(1)

Mobile.verifyElementNotVisible(findTestObject('Menu Login/01 Button LOGIN'), 5)

Mobile.delay(1)

Mobile.callTestCase(findTestCase('Test Cases/TC - BacaRekeningSumber'), null)
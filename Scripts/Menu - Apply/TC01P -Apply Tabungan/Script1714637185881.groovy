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

Mobile.callTestCase(findTestCase('Test Cases/Menu - Login/TC01 - Login-OK'), null)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.Button - Apply'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.Button - Tabungan'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.Button - Mega Dana'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.Button - BUKA REKENING'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Menu Apply/android.widget.EditText'), '1000000', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.CheckBox'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.Button - Lanjut'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.TextView'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Menu Apply/android.widget.EditText (1)'), '111111', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/android.widget.Button - Lanjut (1)'), 0)

Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject('Object Repository/Menu Apply/Verify - Pembukaan Tabungan Berhasil'), 0)

Mobile.delay(1)

Mobile.verifyElementText(findTestObject('Object Repository/Menu Apply/Verify - Pembukaan Tabungan Berhasil'), 'Pembukaan Tabungan Berhasil')

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Apply/Button - close button'), 0)

//Mobile.closeApplication()


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

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.Button - Transfer'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Menu Transfer BIFAST/Button - Transfer ke Bank Lain - BI Fast'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.EditText'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.EditText (1)'), '2009658174', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.Button - Ok'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.Image - arrow-down'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.EditText_Tap'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.EditText_SetText'), 'MEGA SYARIAH', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.RadioButton - BANK MEGA SYARIAH'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.TextView - Nominal_Tap'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.EditText_SetTextNominal'), '11223', 0)

Mobile.delay(1)

//CARA KE-2 : SCROLL TO TEXT UTK CARI NAMA BANK

//Mobile.scrollToText('BANK MEGA SYARIAH')
//
//Mobile.delay(2)
//
//Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/RadioButton - BANK MEGA SYARIAH'), 0)
//
//Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.TextView - Pesan (opsional)_Tap'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.SetText_Pesan'), 'TEST UAT', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.Button - LanjutNew'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.EditText (6)'), '111111', 0)

Mobile.delay(2)

Mobile.swipe(500, 1500, 500, 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Menu Transfer BIFAST/android.widget.Button - LANJUT (1)'), 0)

Mobile.delay(2)

Mobile.pressBack()

Mobile.closeApplication()


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

Mobile.tap(findTestObject('Object Repository/QRIS/android.widget.Button - QRIS'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/QRIS/android.widget.Button - Upload QR'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/QRIS/android.widget.Foto ke 1'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/QRIS/android.view.TapNominal'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/android.widget.EditTextNominal'), '12345', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/QRIS/android.viewTapPesan'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/android.widget.EditTextPesan'), 'testqris', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/QRIS/android.widget.Button - Lanjut (1)'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/QRIS/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/android.widget.EditText (3)'), '111111', 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/QRIS/android.widget.Button - BAYAR'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/QRIS/android.widget.TextView - QRIS Transfer Berhasil'), 0)

Mobile.takeScreenshot()

Mobile.pressBack()



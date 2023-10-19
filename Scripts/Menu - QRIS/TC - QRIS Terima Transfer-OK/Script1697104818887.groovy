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

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.Button - QRIS'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.view.View'), 0)

Mobile.setText(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.EditText'), nominal.toString(), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.Button - Lanjut'), 0)

int no = nominal
String str = String.format('%,d', no).replace(',', '.')

Mobile.verifyElementText(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.TextView - Rp. 11.111'), 'Rp. '+ str)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.Button - share BAGIKAN QRIS'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.ImageButton (2)'), 0)

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/QRIS/QRIS Terima Transfer/android.widget.TextView - Ayo download m-smileAndroid httpsbit.ly3RXHiqEIOS  httpsapple.co3WwH0JD'), 5) 

Mobile.closeApplication()


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

TestData data = findTestData('Data Files/DF_TransferMega')

int baris = 1

Mobile.startApplication('D:\\Katalon Studio\\Installer\\msmiledev_04072023_1316.protected.apk', false)

Mobile.tap(findTestObject('MSmile/Login/01 Button LOGIN'), 0)

Mobile.delay(2)

Mobile.tapAtPosition(531, 2040)

Mobile.delay(2)

Mobile.tap(findTestObject('MSmile/Login/02 Button - Login Dengan Password  Registrasi'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('MSmile/Login/03 Input Password'), 'Bankmega1', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('MSmile/Login/04 Button - LOGIN'), 0)

Mobile.delay(2)

for(baris=1;baris<= data.getRowNumbers();baris++) {

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/1. Button - Transfer'), 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/2. Button - Transfer ke Bank Mega'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input NomorRekBaru'), data.getValue('norek',baris), 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/4. Button - Ok'), 0)

String nominal = data.getValue('nominal',baris)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Nominal'), nominal, 0)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Pesan'), data.getValue('pesan',baris), 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/7. Button - Lanjut'), 0)

Mobile.delay(4)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input M-PIN'), '111111', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/9. Button - LANJUT'), 0)

Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check - Transaksi Berhasil'), 0)

Mobile.verifyElementText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check - Transaksi Berhasil'), 'Transaksi Berhasil')

int no = data.getValue('nominal',baris).toInteger()
String str = String.format('%,d', no).replace(',', '.')

println(str)

Mobile.verifyElementText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check Total Transfer'),"Rp. "+str)

Mobile.delay(2)

Mobile.pressBack()
}

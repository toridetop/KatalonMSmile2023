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

//Script Cek Saldo Before Trx :
GlobalVariable.rekening = GlobalVariable.rekSumber
println(GlobalVariable.rekening)
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Cek Host Saldo SumberTujuan-OK'), null)
GlobalVariable.SaldoAwalSumber = GlobalVariable.SaldoFinalSumberTujuan


GlobalVariable.rekTujuan = GlobalVariable.rekMegaS
GlobalVariable.rekening = GlobalVariable.rekTujuan
println(GlobalVariable.rekening)
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Cek Host Saldo SumberTujuan-OK'), null)
GlobalVariable.SaldoAwalTujuan = GlobalVariable.SaldoFinalSumberTujuan

//--------------------------------------------------------------------------------------------------------------------------

Mobile.startExistingApplication('com.bankmega.msmiledev')

//Mobile.tap(findTestObject('Menu Login/01 Button LOGIN'), 0)
//
//Mobile.delay(2)
//
//Mobile.tapAtPosition(531, 2040)
//
//Mobile.delay(2)
//
//Mobile.tap(findTestObject('Menu Login/02 Button - Login Dengan Password  Registrasi'), 0)
//
//Mobile.delay(2)
//
//Mobile.setText(findTestObject('Menu Login/03 Input Password'), 'Bankmega1', 0)
//
//Mobile.delay(2)
//
//Mobile.tap(findTestObject('Menu Login/04 Button - LOGIN'), 0)
//
//Mobile.delay(2)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/1. Button - Transfer'), 0)

Mobile.delay(1)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/2. Button - Transfer ke Bank Mega'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input NomorRekBaru'), GlobalVariable.rekMegaS, 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/4. Button - Ok'), 0)

String nominal = Nominal

GlobalVariable.NominalTrx = nominal

Mobile.tap(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/Tap Nominal'), 0)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Nominal'), nominal, 0)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Pesan'), Pesan, 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/7. Button - Lanjut'), 0)

Mobile.delay(4)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input M-PIN'), GlobalVariable.mpin, 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/9. Button - LANJUT'), 0)

Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check - Transaksi Berhasil'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check - Transaksi Berhasil'), 'Transaksi Berhasil')

int no = Nominal
String str = String.format('%,d', no).replace(',', '.')

println(str)

Mobile.verifyElementText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check Total Transfer'),"Rp. "+str)

//-----------------------------------------------------------------------------------------------------------------------------
//Script Cek Saldo After Trx :
GlobalVariable.rekening = GlobalVariable.rekSumber
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Cek Host Saldo SumberTujuan-OK'), null)
GlobalVariable.SaldoAkhirSumber = GlobalVariable.SaldoFinalSumberTujuan

GlobalVariable.rekening = GlobalVariable.rekTujuan
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Cek Host Saldo SumberTujuan-OK'), null)
GlobalVariable.SaldoAkhirTujuan = GlobalVariable.SaldoFinalSumberTujuan

Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Hitung Saldo SumberTujuan-OK'), null)

Mobile.pressBack()

Mobile.pressBack()
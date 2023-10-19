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
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Check Host Master'), null)
String SaldoAwalSumber = GlobalVariable.SaldoAwal
println(SaldoAwalSumber)

GlobalVariable.rekening = GlobalVariable.rekMegaS
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Check Host Master'), null)
String SaldoAwalTujuan = GlobalVariable.SaldoAwal
println(SaldoAwalTujuan)

//--------------------------------------------------------------------------------------------------------------------------
//String SaldoAwal = GlobalVariable.SaldoAwal

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.tap(findTestObject('Menu Login/01 Button LOGIN'), 0)

Mobile.delay(2)

Mobile.tapAtPosition(531, 2040)

Mobile.delay(2)

Mobile.tap(findTestObject('Menu Login/02 Button - Login Dengan Password  Registrasi'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Menu Login/03 Input Password'), 'Bankmega1', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Menu Login/04 Button - LOGIN'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/1. Button - Transfer'), 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/2. Button - Transfer ke Bank Mega'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input NomorRekBaru'), RekMegaS, 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/4. Button - Ok'), 0)

String nominal = Nominal

Mobile.tap(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/Tap Nominal'), 0)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Nominal'), nominal, 0)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Pesan'), Pesan, 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/7. Button - Lanjut'), 0)

Mobile.delay(4)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input M-PIN'), '111111', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/9. Button - LANJUT'), 0)

Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check - Transaksi Berhasil'), 0)

Mobile.verifyElementText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check - Transaksi Berhasil'), 'Transaksi Berhasil')

int no = Nominal
String str = String.format('%,d', no).replace(',', '.')

println(str)

Mobile.verifyElementText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check Total Transfer'),"Rp. "+str)

//-----------------------------------------------------------------------------------------------------------------------------
//Script Cek Saldo After Trx :

GlobalVariable.rekening = GlobalVariable.rekSumber
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Check Host Master'), null)
String SaldoAkhirSumber = GlobalVariable.SaldoAwal
println(SaldoAkhirSumber)

GlobalVariable.rekening = GlobalVariable.rekMegaS
Mobile.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/TC - Check Host Master'), null)
String SaldoAkhirTujuan = GlobalVariable.SaldoAwal
println(SaldoAkhirTujuan)

//----------------------------------------------------------------------------------------------------------------------------
//CEK DI HOST UTK REKENING TUJUAN SAJA
//Hitung Saldo awal dengan nominal trx :
//script perhitungan penjumlahan/pengurangan saldo awal dengan nominal transaksi yg diinput user sbb:
//script ini bisa diinsert di masing2 test case nantinya
//String strsaldoawal = GlobalVariable.SaldoAwal

def saldoawalsumberdesimal = SaldoAwalSumber.toDouble()
def saldoawaltujuandesimal = SaldoAwalTujuan.toDouble()
def saldoakhirsumberdesimal = SaldoAkhirSumber.toDouble()
def saldoakhirtujuandesimal = SaldoAkhirTujuan.toDouble()

def nominaltrx = Nominal
//Nominal diatas adalah nominal trx (hardcode), bisa diganti dgn variable Nominal yg ada di test case masing2

//script RUMUS perhitungan (penjumlahan/pengurangan) saldo dengan nominal trx :
def hitungsaldosumber = saldoawalsumberdesimal - nominaltrx
println(hitungsaldosumber)

def hitungsaldotujuan = saldoawaltujuandesimal + nominaltrx
println(hitungsaldotujuan)

//script ubah format nominal menjadi 2 digit dibelakang koma, sbb :
def saldoformatsumber = String.format('%.2f', hitungsaldosumber)
println(saldoformatsumber)

def saldoformattujuan = String.format('%.2f', hitungsaldotujuan)
println(saldoformattujuan)

Mobile.verifyMatch(SaldoAkhirSumber, saldoformatsumber, false)
Mobile.verifyMatch(SaldoAkhirTujuan, saldoformattujuan, false)

Mobile.pressBack()
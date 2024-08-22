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

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.Button - Top Up'), 0)

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.Image - paket_data'), 0)

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.EditText (1)'), '081513733316', 
    0)

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.Button - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.Image - arrow-down-jenis-paket'), 0)

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat-New/View-PaketData1'), 
    0)


String nominal = Mobile.getText(findTestObject('Object Repository/Menu Top Up/OR-Pulsa-Indosat/GetText-Nominal'), 0)

println(nominal)


Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.Button - Lanjut (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/tap mpin'), 0)

Mobile.delay(2)

for(int i = 0; i <= 5; i++) {
	Mobile.tapAtPosition(190, 1635)
	}

//Mobile.setText(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.EditText (4)'), '111111', 
//    0)

Mobile.tap(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/android.widget.Button - TOP UP (1)'), 0)

Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/txt - Pembelian Berhasil'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/txt - Pembelian Berhasil'), 'Pembelian Berhasil')

int byadm = 1500
String adm = String.format('%,d', byadm).replace(',', '.')

Mobile.verifyElementText(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/byadm - Rp. 1.500'),"Rp. "+adm)


int nominalint = nominal.toInteger() //merubah tipe data nominal dari string ke int

int totaltopup = nominalint + byadm //perhitungan nominal paket data ditambah biaya admin

println(totaltopup)

String tot = String.format('%,d', totaltopup).replace(',', '.')

println(tot)


Mobile.verifyElementText(findTestObject('Object Repository/Menu Top Up/OR-PaketData-Indosat/total - Rp. 51.500'),"Rp. "+tot)

Mobile.pressBack()


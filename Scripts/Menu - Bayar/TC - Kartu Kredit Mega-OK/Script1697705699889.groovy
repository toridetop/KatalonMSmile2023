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

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Button - Bayar'), 0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Bayar_Kartu Kredit'), 0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Daftar Produk - arrow-down'), 0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_TextView - CREDIT CARD MEGA'), 0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_NoPelanggan - arrow-down'), 0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Input Nomor KK'), 0)

Mobile.setText(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/SetText_Input Nomor KK'), '4201920062143449', 
    0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Button - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Button - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Masukkan Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/SetText_Masukkan Nominal Bayar'), nominal.toString(), 
    0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_MPIN'), 0)

Mobile.delay(1)

Mobile.tapAtPosition(190, 1635)
Mobile.tapAtPosition(190, 1635)
Mobile.tapAtPosition(190, 1635)
Mobile.tapAtPosition(190, 1635)
Mobile.tapAtPosition(190, 1635)
Mobile.tapAtPosition(190, 1635)
//Mobile.setText(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/SetText_MPIN'), GlobalVariable.mpin, 
//    0)

Mobile.tap(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Tap_Button - BAYAR (1)'), 0)

Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Verify_TextView - Pembayaran Berhasil'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Verify_TextView - Pembayaran Berhasil'), 'Pembayaran Berhasil')

Mobile.verifyElementText(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Verify_TextView - Biaya Admin'), 'Rp. 0')

int tot = nominal - 0
String total = String.format('%,d', tot).replace(',', '.')

println(total)

Mobile.verifyElementText(findTestObject('Object Repository/Menu - Bayar/Kartu Kredit-YES/Verify_TextView - Total Bayar'), "Rp. "+total)

Mobile.pressBack()

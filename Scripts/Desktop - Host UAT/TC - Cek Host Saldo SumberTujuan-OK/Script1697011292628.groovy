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
import com.kms.katalon.core.windows.driver.WindowsDriverFactory
import com.kms.katalon.core.windows.keyword.helper.WindowsActionHelper

Windows.startApplicationWithTitle('C:\\Users\\08093761\\Desktop\\COREDEV.WS', 'COREDEV')

Windows.setText(findWindowsObject('Object Repository/HOST UAT/Edit'), 'u4fitrii')

Windows.click(findWindowsObject('Object Repository/HOST UAT/Edit(1)'))

Windows.setText(findWindowsObject('Object Repository/HOST UAT/Edit(1)'), 'MEGABANK')

Windows.click(findWindowsObject('Object Repository/HOST UAT/Button'))

Windows.delay(1)

if	(Windows.verifyElementPresent(findWindowsObject('Object Repository/HOST UAT/Button(1)'), 5, FailureHandling.OPTIONAL)){
	
	Windows.click(findWindowsObject('Object Repository/HOST UAT/Button(1)'))
}
else {
	Windows.delay(1)
}

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('u4fitrii'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.TAB))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('megabank'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.CONTROL))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('2'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('3'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(GlobalVariable.rekening))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)


// script take screen shot di desktop apps :
String screenshotLocation = 'Images//01.png' 
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotLocation)

Windows.delay(2)

Windows.closeApplication()

Windows.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/Read Image Host-OK'), null)

//Script untuk mengambil nominal di baris Ledger Balance yg sudah disimpan di Global Variable
String saldo = GlobalVariable.LedgerBalance

//script ambil text sebelum kata '1 Day'
String sebelum = saldo.substring(0, saldo.indexOf('1 Day'))
println(sebelum)

//script mengambil setelah tanda baca ':' :
String nominal = sebelum.substring(sebelum.indexOf(': ') + 1)
println(nominal)

//script untuk menghilangkan spasi di depan nominal :
String hapusspasi = nominal.replaceAll(' ', '')
println(hapusspasi)

//script menghilangkan tanda koma agar bisa dihitung :
String saldofinal = hapusspasi.replaceAll(',', '')
println(saldofinal)

GlobalVariable.SaldoFinalSumberTujuan = saldofinal



	
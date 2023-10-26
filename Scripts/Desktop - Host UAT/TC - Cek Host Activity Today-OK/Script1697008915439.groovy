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
	Windows.delay(5)
}
else {
	Windows.delay(5)
}

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('u4fitrii'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('megabank'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.CONTROL))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('2'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('3'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(GlobalVariable.rekMega))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.F11))

Windows.delay(1)

if	(Windows.verifyElementPresent(findWindowsObject('Object Repository/HOST UAT/No Trx found Text'), 5, FailureHandling.OPTIONAL)){
	
	Windows.closeApplication()
}
else {

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('1'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('1'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(1)

String screenshotLocation1 = 'Images//ss1.png'
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotLocation1)

String tgl1 = new Date().format('ddMMYYYY HH.mm.ss')
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot('SSHost/Saldo_'+tgl1+'.png')

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

String screenshotLocation2 = 'Images//trcd.png'
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotLocation2)

String tgl2 = new Date().format('ddMMYYYY HH.mm.ss')
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot('SSHost/Saldo_'+tgl2+'.png')

Windows.delay(1)


//// script take screen shot di desktop apps :
//String screenshotLocation = 'Images//01.png' 
//WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotLocation)
//
//Windows.delay(2)

Windows.callTestCase(findTestCase('Test Cases/Desktop - Host UAT/Read Image Host - Activity Today-OK'), null)

//Script untuk mengambil nominal di baris Ledger Balance yg sudah disimpan di Global Variable
String trancode1 = GlobalVariable.TransactionCode

String trancode = trancode1.tokenize(' ')[3]
println(trancode)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.F3))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.F3))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.F12))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('13'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))
Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('3'))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))
Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.TAB))
Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(trancode+trancode))

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))
Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.SHIFT+Keys.TAB))
Windows.delay(1)

//JIKA ADA LEBIH DARI 1 BARIS TELLER LOG :
Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ARROW_UP))
Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('1'+'1'))
Windows.delay(1)

//Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('1'))
//
//Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))
//Windows.delay(1)
if	(Windows.verifyElementPresent(findWindowsObject('Object Repository/HOST UAT/Text-Cursor in protected area of display'), 5, FailureHandling.OPTIONAL)){
	
	Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))
	Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord('1'))
}
else {
	Windows.delay(1)
}

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))

String screenshotLocation3 = 'Images//ss3.png'
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotLocation3)
Windows.delay(1)

String tgl3 = new Date().format('ddMMYYYY HH.mm.ss')
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot('SSHost/Saldo_'+tgl3+'.png')

Windows.sendKeys(findWindowsObject('Object Repository/HOST UAT/Pane'), Keys.chord(Keys.ENTER))
Windows.delay(1)

String screenshotLocation4 = 'Images//ss4.png'
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotLocation4)
Windows.delay(1)

String tgl4 = new Date().format('ddMMYYYY HH.mm.ss')
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot('SSHost/Saldo_'+tgl4+'.png')

Windows.closeApplication()
}
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

Windows.startApplicationWithTitle('C:\\Users\\08093761\\Desktop\\PRODUAT.WS', 'PRODUAT')

TestData data = findTestData('Data Files/Data Power10')

Windows.setText(findWindowsObject('Object Repository/SettingPower10/Edit'), 'ADMUAT')

Windows.click(findWindowsObject('Object Repository/SettingPower10/Edit(PASSWORD)'))

Windows.setText(findWindowsObject('Object Repository/SettingPower10/Edit(PASSWORD)'), 'ADMUAT')

Windows.click(findWindowsObject('Object Repository/SettingPower10/Button OK'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane(1)'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane(1)'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane(COMMANDLINE)'), Keys.chord('strsql'))

//Windows.setText(findWindowsObject('Object Repository/SettingPower10/Pane(COMMANDLINE)'), 'strsql', 0)

Windows.delay(1)

Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane(COMMANDLINE)'), Keys.chord(Keys.ENTER))

Windows.delay(1)

int baris = 1

for (baris = 1; baris <= data.getRowNumbers(); baris++) {

//Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane(SQL)'), data.getValue('mxcomp', baris), 0)

String textawal = data.getValue('mxcomp', baris)
println(textawal)
teksAkhir = textawal.toLowerCase()
println(teksAkhir)
Windows.setText(findWindowsObject('Object Repository/SettingPower10/Pane(SQL)'), teksAkhir)

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/SettingPower10/Pane(SQL)'), Keys.chord(Keys.ENTER))

Windows.delay(2)

}

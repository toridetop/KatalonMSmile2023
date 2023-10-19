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

TestData data = findTestData('Data Files/DF-TransferMega-DormantClose')

int baris = 1

//Mobile.callTestCase(findTestCase('Test Cases/Menu - Login/TC01 - Login-OK'), null)
for (baris = 1; baris <= data.getRowNumbers(); baris++) {
//	if((baris==2)||(baris==4)) tambahkan ini:jika ingin running hanya baris 2 dan 4 saja di data file
    Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/1. Button - Transfer'), 0)

    Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/2. Button - Transfer ke Bank Mega'), 0)

    Mobile.delay(2)

    Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input NomorRekBaru'), data.getValue('NoRek', baris), 
        0)

    Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/4. Button - Ok'), 0)

    String nominal = data.getValue('Nominal', baris)

    Mobile.tap(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt_nominal'), 0)

    Mobile.setText(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt_nominal_tap'), nominal, 0)

    Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Pesan'), data.getValue('Pesan', baris), 0)

    Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/7. Button - Lanjut'), 0)

    Mobile.delay(4)

    Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input M-PIN'), '111111', 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/9. Button - LANJUT'), 0)

    Mobile.delay(2)

    if (data.getValue('Status', baris) == '2') {
        Mobile.waitForElementPresent(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt - Closed Account H78'), 
            0)

        Mobile.verifyElementText(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt - Closed Account H78'), 
            'Closed Account [H78]', FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.tap(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/trx-Close Acct-Button - TUTUP'), 
            0)

        Mobile.pressBack()
    } else if (Mobile.verifyElementVisible(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/10. Verify - Transaksi Berhasil'), 
        3)) {
        int no = data.getValue('Nominal', baris).toInteger()

        String str = String.format('%,d', no).replace(',', '.')

        Mobile.verifyElementText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Check Total Transfer'), 'Rp. ' + str)

        Mobile.delay(2)

        Mobile.pressBack()
    } else {
        Mobile.delay(1)
    }
}
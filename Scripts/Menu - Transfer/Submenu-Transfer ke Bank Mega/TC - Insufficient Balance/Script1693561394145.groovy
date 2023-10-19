import internal.GlobalVariable

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//Mobile.callTestCase(findTestCase('Test Cases/Menu - Login/TC01 - Login-OK'), null)

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/1. Button - Transfer'), 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/2. Button - Transfer ke Bank Mega'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input NomorRekBaru'), GlobalVariable.rekMegaS, 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/4. Button - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt_nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt_nominal_tap'), '120000', 0)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input Pesan'), 'test insufficient', 0)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/7. Button - Lanjut'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input M-PIN'), 0)

Mobile.setText(findTestObject('Menu Transfer/Transfer ke Bank Mega/Input M-PIN'), GlobalVariable.mpin, 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Menu Transfer/Transfer ke Bank Mega/9. Button - LANJUT'), 0)

Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt dana anda tidak cukup'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/txt dana anda tidak cukup'), 'Dana Anda tidak cukup untuk melakukan transaksi. Pastikan sumber dana yang Anda pilih cukup atau tidak kurang dari Saldo Minimum. [H51]')

Mobile.tap(findTestObject('Object Repository/Menu Transfer/Transfer ke Bank Mega/Button-danatidakcukup - TUTUP'), 0)



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

//----------------------------------------------------------------------------------------------------------------------------
//CEK DI HOST UTK REKENING SUMBER DAN TUJUAN
//Hitung Saldo awal dengan nominal trx :
//script perhitungan penjumlahan/pengurangan saldo awal dengan nominal transaksi yg diinput user sbb:
//script ini bisa diinsert di masing2 test case nantinya
//String strsaldoawal = GlobalVariable.SaldoAwal
String saldoawalsumberdesimal = GlobalVariable.SaldoAwalSumber

def saldoawalsumberdes2 = saldoawalsumberdesimal.toDouble()

String saldoakhirsumberdesimal = GlobalVariable.SaldoAkhirSumber

println(GlobalVariable.NominalTrx)

String nominaltrx1 = GlobalVariable.NominalTrx

println(nominaltrx1)

def nominaltrx = nominaltrx1.toDouble()

//Nominal diatas adalah nominal trx (hardcode), bisa diganti dgn variable Nominal yg ada di test case masing2
//script RUMUS perhitungan (penjumlahan/pengurangan) saldo dengan nominal trx :
def hitungsaldosumber = saldoawalsumberdes2 - nominaltrx

println(hitungsaldosumber)

//script ubah format nominal menjadi 2 digit dibelakang koma, sbb :
def saldofinalsumber = String.format('%.2f', hitungsaldosumber)

println(saldofinalsumber)

Mobile.verifyMatch(saldoakhirsumberdesimal, saldofinalsumber, false, FailureHandling.CONTINUE_ON_FAILURE)

if (GlobalVariable.SaldoAwalTujuan != '') {
    //script perhitungan dan verifikasi
    String saldoawaltujuandesimal = GlobalVariable.SaldoAwalTujuan

    def saldoawaltujuandes2 = saldoawaltujuandesimal.toDouble()

    String saldoakhirtujuandesimal = GlobalVariable.SaldoAkhirTujuan

    String nominaltrx3 = GlobalVariable.NominalTrx

    def nominaltrx4 = nominaltrx3.toDouble()

    //Nominal diatas adalah nominal trx (hardcode), bisa diganti dgn variable Nominal yg ada di test case masing2
    //script RUMUS perhitungan (penjumlahan/pengurangan) saldo dengan nominal trx :
    def hitungsaldotujuan = saldoawaltujuandes2 + nominaltrx4

    println(hitungsaldotujuan)

    //script ubah format nominal menjadi 2 digit dibelakang koma, sbb :
    def saldofinaltujuan = String.format('%.2f', hitungsaldotujuan)

    println(saldofinaltujuan)

    Mobile.verifyMatch(saldoakhirtujuandesimal, saldofinaltujuan, false, FailureHandling.CONTINUE_ON_FAILURE)

    GlobalVariable.SaldoAwalTujuan = ''
} else {
    Mobile.delay(2)

    GlobalVariable.SaldoAwalTujuan = ''
}


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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flpshop-de.cmp-shop.com/login.aspx?RefUrl=EigeneBestellungen.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/delay/Page_/input__ctl00ContentPlaceHolder1tbx_email'), '421000002236')

WebUI.setEncryptedText(findTestObject('Object Repository/delay/Page_/input__ctl00ContentPlaceHolder1tbx_login'), 'R2gbD8qAjzk=')

WebUI.click(findTestObject('Object Repository/delay/Page_/input_Pflichtfelder_ctl00ContentPlaceHolder_21e322'))

for (def i = 0; i <= 25; i++) {
    WebUI.click(findTestObject('Object Repository/delay/Page_/img'))

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('delay/Page_/scrollup'), 0)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('delay/Page_/scrolltoforeverlean'), 0)

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/delay/Page_- sport  fitness/a_26,90_info-link'))

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('delay/Page_/scrolltoforeverleancard'), 0)

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/delay/Page_- FOREVER LEAN/img'))

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('delay/Page_/scrollup'), 0)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('delay/Page_/scrollLifebalance'), 0)

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/delay/Page_/img_1'))

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('delay/Page_/scrollonbeautyandwellness'), 0)

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/delay/Page_- beauty  wellness/a_Produkte_logo'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/delay/Page_/img'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/delay/Page_- sport  fitness/a_Produkte_logo'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/delay/Page_/span_Produkte'))

    WebUI.delay(10)
}


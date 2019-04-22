import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.winium.DesktopOptions as DesktopOptions
import org.openqa.selenium.winium.WiniumDriver as WiniumDriver
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL

checkname( //driver.findElement(By.name('Testing')).click()
    //driver.findElement(By.id('397878')).sendKeys('38')
    //driver.findElement(By.id('397878')).click()
    //driver.findElement(By.name('向上')).click()
    ) //driver.findElement(By.id('Close')).click()
//driver.findElement(By.name('Testing')).click()
//result = 'Allen Liu (male, 1) Development'
//println driver.findElement(By.id('lstPersonList')).getAttribute('Name')

def checkname() {
    WiniumDriver driver = null

    String appPath = 'D:/RxDemoApp.exe'

    DesktopOptions option = new DesktopOptions()

    option.setApplicationPath(appPath)

    option.setDebugConnectToRunningApp(false)

    option.setLaunchDelay(2)

    driver = new WiniumDriver(new URL('http://localhost:9999'), option)

    Thread.sleep(1000)

    driver.findElement(By.name('Test database')).click()

    driver.findElement(By.id('txtFirstName')).sendKeys('Allen')

    driver.findElement(By.id('txtLastName')).sendKeys('Liu')

    CustomKeywords.'win10_Operations.VE.tab_button'()

    CustomKeywords.'win10_Operations.VE.down_button'()

    CustomKeywords.'win10_Operations.VE.tab_button'()

    CustomKeywords.'win10_Operations.VE.up_button'()

    driver.findElement(By.id('rdbMale')).click()

    driver.findElement(By.id('btnAddPerson')).click()
	
	//driver.findElement(By.xpath('/*[contains(@Name,"Allen Liu (male, 1)")]')).getAttribute('Name')
	
	//println driver.findElement(By.id('11904')).getAttribute('Name')
	
}


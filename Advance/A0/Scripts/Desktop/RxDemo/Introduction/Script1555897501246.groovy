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

checkname()

def checkname() {
    WiniumDriver driver = null

    String appPath = 'D:/RxDemoApp.exe'

    DesktopOptions option = new DesktopOptions()

    option.setApplicationPath(appPath)

    option.setDebugConnectToRunningApp(false)

    option.setLaunchDelay(2)

    driver = new WiniumDriver(new URL('http://localhost:9999'), option)

    Thread.sleep(1000)

    name = name
	
	driver.findElement(By.name('Introduction')).click()

    driver.findElement(By.id('txtUserName')).sendKeys(name)

    driver.findElement(By.id('btnSubmitUserName')).click()

    Thread.sleep(1000)

    assert driver.findElement(By.id('lblWelcomeMessage')).getAttribute('Name') == result

    driver.findElement(By.id('Close')).click()
}


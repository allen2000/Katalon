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
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.InputEvent as InputEvent
import java.awt.event.KeyEvent as KeyEvent
import java.awt.datatransfer.Clipboard as Clipboard
import java.awt.datatransfer.DataFlavor as DataFlavor
import java.awt.datatransfer.Transferable as Transferable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sahitest.com/demo/')

WebUI.click(findTestObject('Object Repository/sahutest/upload/Page_Sahi Tests/a_File Upload Test'))

WebUI.click(findTestObject('sahutest/upload/Page_/up_btn'))

WebUI.delay(1)

getclipb()

CustomKeywords.'win10_Operations.VE.paste_and_enter'()

WebUI.click(findTestObject('Object Repository/sahutest/upload/Page_/input_File_submit'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('sahutest/upload/Page_/span_79.2392578125 Kb'), '79.2392578125 Kb')

def getclipb() {
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()

    String str = Ufile

    StringSelection selection = new StringSelection(str)

    clipboard.setContents(selection, selection)

    Transferable content = clipboard.getContents(null)

    String text = ((content.getTransferData(DataFlavor.stringFlavor)) as String)

    println(text)

    return text
}

def paste() {
    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)
}


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

response = WS.sendRequest(findTestObject('API/atlassian/serverInfo'))

WS.verifyResponseStatusCode(response, 200)

'single parameter check'
WS.verifyElementPropertyValue(response, 'version', '1001.0.0-SNAPSHOT')

WS.verifyElementPropertyValue(response, 'versionNumbers[0]', '1001')

WS.verifyResponseStatusCodeInRange(response, 100, 300)

WS.verifyElementsCount(response, '', 8)

WS.containsString(response, 'Cloud', false)

'just foe xml?'
not_run: WS.verifyElementText(response, 'deploymentType', 'Cloud')


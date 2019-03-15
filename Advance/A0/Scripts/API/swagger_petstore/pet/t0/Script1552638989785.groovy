import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import groovy.json.JsonSlurper as JsonSlurper
import static org.assertj.core.api.Assertions.*

response = WS.sendRequest(findTestObject('API/swagger_petstore/pet/GetPetStatus', [('status') : 'sold']))

WS.verifyResponseStatusCode(response, 200)

request = findTestObject('API/swagger_petstore/pet/GetPetStatus', [('status') : 'sold'])

println (request.getRestRequestMethod())


List<TestObjectProperty> lsObj = request.getHttpHeaderProperties()

not_run: lsObj.each({ def it ->
        println((it.getName() + '==>') + it.getValue())

        String name = it.getName()

        switch (name) {
            case 'Content-Type':
                assertThat(it.getValue()).isEqualTo('application/xml')

                break
            case 'Authorization':
                assertThat(it.getValue()).isEqualTo(GlobalVariable.authorization)

                break
            default:
                break
        }
    })


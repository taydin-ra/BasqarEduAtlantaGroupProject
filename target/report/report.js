$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/featureFiles/Discounts.feature");
formatter.feature({
  "line": 1,
  "name": "Create a new discount",
  "description": "",
  "id": "create-a-new-discount",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Login  with  username and  password",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Navigate to Basqar: \"https://test.basqar.techno.study/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the username \"daulet2030@gmail.com\" and password \"TechnoStudy123@\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://test.basqar.techno.study/",
      "offset": 21
    }
  ],
  "location": "LoginSteps.navigate_to_Basqar(String)"
});
formatter.result({
  "duration": 8380197687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "daulet2030@gmail.com",
      "offset": 20
    },
    {
      "val": "TechnoStudy123@",
      "offset": 56
    }
  ],
  "location": "LoginSteps.enterTheUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 885404037,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "duration": 200225410,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Create a discount on Basqar",
  "description": "",
  "id": "create-a-new-discount;create-a-discount-on-basqar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I click on Setup",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Parameter",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Discounts",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on add discount button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \"MyDiscount\" in the \"description\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter \"MyD123\" in the \"integrationCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"1\" in the \"priority\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "\"VerificationMessage\" is seen \"successfully\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Edit button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I update the discount name as\"MyDiscount1\" in the \"description\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "\"VerificationMessage\" is seen \"successfully\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on delete button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I confirm \"Yes\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "\"VerificationMessage\" is seen \"successfully\"",
  "keyword": "And "
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_Setup()"
});
formatter.result({
  "duration": 6731594503,
  "status": "passed"
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_Parameter()"
});
formatter.result({
  "duration": 976657589,
  "status": "passed"
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_Discounts()"
});
formatter.result({
  "duration": 758011909,
  "status": "passed"
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_add_discount_button()"
});
formatter.result({
  "duration": 764679659,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyDiscount",
      "offset": 9
    },
    {
      "val": "description",
      "offset": 29
    }
  ],
  "location": "DiscountsSteps.i_enter_in_the(String,String)"
});
formatter.result({
  "duration": 402870895,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyD123",
      "offset": 9
    },
    {
      "val": "integrationCode",
      "offset": 25
    }
  ],
  "location": "DiscountsSteps.i_enter_in_the(String,String)"
});
formatter.result({
  "duration": 315365482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    },
    {
      "val": "priority",
      "offset": 20
    }
  ],
  "location": "DiscountsSteps.i_enter_in_the(String,String)"
});
formatter.result({
  "duration": 287865280,
  "status": "passed"
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_Save_button()"
});
formatter.result({
  "duration": 118369747,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VerificationMessage",
      "offset": 1
    },
    {
      "val": "successfully",
      "offset": 31
    }
  ],
  "location": "DiscountsSteps.is_created(String,String)"
});
formatter.result({
  "duration": 13408646045,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //div[@class\u003d\u0027toast-bottom-right toast-container\u0027]\u0027 (tried for 10 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat POMFiles.Parent.waitAndGetText(Parent.java:51)\n\tat POMFiles.DiscountPage.findElementAndGetText(DiscountPage.java:105)\n\tat stepDefinition.DiscountsSteps.is_created(DiscountsSteps.java:54)\n\tat ✽.And \"VerificationMessage\" is seen \"successfully\"(src/test/java/featureFiles/Discounts.feature:20)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027toast-bottom-right toast-container\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.83)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027yavuzs-mbp-2.lan\u0027, ip: \u0027fe80:0:0:0:815:af2e:3a1:119%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.83, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: /var/folders/mc/w6z66bsd32s...}, goog:chromeOptions: {debuggerAddress: localhost:51853}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 3f372a6be13652f85a5b0f6fcf171015\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027toast-bottom-right toast-container\u0027]}\n\tat sun.reflect.GeneratedConstructorAccessor19.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat POMFiles.Parent.waitAndGetText(Parent.java:51)\n\tat POMFiles.DiscountPage.findElementAndGetText(DiscountPage.java:105)\n\tat stepDefinition.DiscountsSteps.is_created(DiscountsSteps.java:54)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:714)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:767)\n\tat org.testng.TestRunner.run(TestRunner.java:617)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:334)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:240)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1149)\n\tat org.testng.TestNG.run(TestNG.java:1057)\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:110)\n",
  "status": "failed"
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_Edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "MyDiscount1",
      "offset": 30
    },
    {
      "val": "description",
      "offset": 51
    }
  ],
  "location": "DiscountsSteps.i_update_the_discount_name_as_in_the(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VerificationMessage",
      "offset": 1
    },
    {
      "val": "successfully",
      "offset": 31
    }
  ],
  "location": "DiscountsSteps.is_created(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DiscountsSteps.i_click_on_delete_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 11
    }
  ],
  "location": "DiscountsSteps.i_confirm(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VerificationMessage",
      "offset": 1
    },
    {
      "val": "successfully",
      "offset": 31
    }
  ],
  "location": "DiscountsSteps.is_created(String,String)"
});
formatter.result({
  "status": "skipped"
});
});
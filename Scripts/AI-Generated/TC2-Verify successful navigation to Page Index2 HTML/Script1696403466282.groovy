import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page index2 html'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/index2.html')

'step 2: Add visual checkpoint at Page index2 html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify successful navigation to Page Index2 HTML_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}

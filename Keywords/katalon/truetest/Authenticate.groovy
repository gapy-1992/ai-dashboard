package katalon.truetest

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.transform.CompileStatic

class Authenticate {
	/**
	 * basic authentication
	 */
	@Keyword
	def basic_auth(String url, String userName, String password) {
		String usernamePasswordURL = getAuthenticatedUrl(PathUtil.getUrl(url, "https"), userName, password)
		WebUI.navigateToUrl(usernamePasswordURL)
	}

	@CompileStatic
	private String getAuthenticatedUrl(URL url, String userName, String password) {
		StringBuilder getAuthenticatedUrl = new StringBuilder()

		getAuthenticatedUrl.append(url.getProtocol())
		getAuthenticatedUrl.append("://")
		getAuthenticatedUrl.append(userName)
		getAuthenticatedUrl.append(":")
		getAuthenticatedUrl.append(password)
		getAuthenticatedUrl.append("@")
		getAuthenticatedUrl.append(url.getHost())
		getAuthenticatedUrl.append(url.getPath())

		return getAuthenticatedUrl.toString()
	}
}


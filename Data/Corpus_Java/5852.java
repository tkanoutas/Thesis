/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.com.bottega.acceptance.commons.agents.browser;

import org.apache.commons.lang3.StringUtils;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.web.selenium.PropertyWebDriverProvider;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pl.com.bottega.acceptance.commons.BrowserAgent;

@BrowserAgent
public class BrowserAgentDriverProvider extends PropertyWebDriverProvider {

    @Override
    protected InternetExplorerDriver createInternetExplorerDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        return new InternetExplorerDriver(capabilities);
    }

    @Override
    protected ChromeDriver createChromeDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        String chromeBinary = System.getProperty("chrome.binary");
        if (StringUtils.isNotBlank(chromeBinary)) {
            capabilities.setCapability("chrome.binary", chromeBinary);
        }
        return new ChromeDriver(capabilities);
    }

    @BeforeStories
    public void beforeStories() throws Exception {
        initialize();
    }

    @AfterStories
    public void afterStories() throws Exception {
        end();
    }

    @BeforeScenario
    public void beforeEachScenario() throws Exception {
        get().manage().deleteAllCookies();
    }
}

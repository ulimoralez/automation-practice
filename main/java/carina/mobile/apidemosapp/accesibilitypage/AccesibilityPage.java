package carina.mobile.apidemosapp.accesibilitypage;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccesibilityPage extends AbstractPage {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")
    private ExtendedWebElement accesibilityNodeProviderPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]")
    private ExtendedWebElement accesibilityNodeQueryingPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Service\"]")
    private ExtendedWebElement accesibilityServicePage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Custom View\"]")
    private ExtendedWebElement customViewPage;

    public AccesibilityPage(WebDriver driver) {
        super(driver);
    }

    public AccesibilityNodeProviderPage goToAccesibilityNodeProvider(WebDriver driver) {
        accesibilityNodeProviderPage.click();
        return new AccesibilityNodeProviderPage(driver);
    }
}

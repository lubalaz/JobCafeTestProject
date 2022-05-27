package Pages;

public class AboutUsPage extends BasePage{


    public static final String ABOUT_US_HEADER = "//h2[text()='About Us']";

    public boolean isPageTitleVisible(){
        return elementExists(ABOUT_US_HEADER);

    }
}

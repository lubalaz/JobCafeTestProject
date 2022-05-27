package Pages;


import Consts.Consts;

public class HomePage extends BasePage{

    private static final String LOGO_IMG = "//img[@class='img-fluid']";
    private static final String ABOUT_US_OPTION = "//a[text()='About']";
    private static final String JOBS_MENU_OPTION = "//a[text()='Jobs']";



    public void navigateToHomePage() {
        webDriver.get(Consts.MAIN_URL);

    }


    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }
    public AboutUsPage openAboutUsTab() {
        clickElementByXpath(ABOUT_US_OPTION);
        return new AboutUsPage();
    }
    public JobsPage openJobsMenu() {
        clickElementByXpath(JOBS_MENU_OPTION);
        return new JobsPage();
    }
    //public JobsPage openLoginIcon() {
     //   clickElementByXpath(LOGIN_ICON);
     //   return new JobsPage();
    }





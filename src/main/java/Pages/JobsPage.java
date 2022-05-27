package Pages;

import Consts.Consts;

public class JobsPage extends BasePage{
    public static final String LOG_IN_HEADER = "//h2[text()='Lg In']";
    public static final String JOBS_HEADER = "//h2[text()='Jobs']";
    private static final String USERNAME_FIELD = "//input[@placeholder='Username']";
    private static final String PASSWORD_FIELD = "//input[@type='password']";
    private static final String LOGIN_ICON = "//button[@type='submit']";
    private static final String LOCATION_TAB = "//input[@name='location']";
    private static final String SEARCH_ICON = "//button[text()='search']";
    private static final String POSITION_TAB = "//input[@name='position']";
    private static final String COMPANY_TAB = "//input[@name='company']";
    private static final String DESCRIPTION_TAB = "//input[@name='description']";
    private static final String RESET_ICON = "//button[text()='reset']";
    private static final String JUNIOR_BUTTON = "//span[text()='junior']";
    private static final String MID_BUTTON = "//input[@class='PrivateSwitchBase-input css-1m9pwf3']";
    private static final String SENIOR_BUTTON = "//input[@id='senior']";
    private static final String MANAGER_BUTTON = "//input[@id='manager']";

    public boolean isPageTitleVisible(){
        return elementExists(JOBS_HEADER);

    }
    public boolean isPageTitleVisible2(){
        return elementExists(LOG_IN_HEADER);

    }

    public void populateUser(String text) {
        sendTextToElementByXpath(USERNAME_FIELD, text);

    }


    public JobsPage populatePassword(String text) {
        sendTextToElementByXpath(PASSWORD_FIELD, text);

        return null;
    }




    public JobsPage openLogInIcon() {
        clickElementByXpath(LOGIN_ICON);
        return new JobsPage();
    }

    public JobsPage populateLocation(String text) {
        sendTextToElementByXpath(LOCATION_TAB, text);

        return null;
    }

    public JobsPage pressSearchIcon() {
        clickElementByXpath(SEARCH_ICON);
        return new JobsPage();
    }
    public JobsPage populatePosition(String text) {
        sendTextToElementByXpath(POSITION_TAB, text);

        return null;
    }
    public JobsPage populateCompany(String text) {
        sendTextToElementByXpath(COMPANY_TAB, text);

        return null;
    }
    public JobsPage populateDescription(String text) {
        sendTextToElementByXpath(DESCRIPTION_TAB, text);

        return null;
    }
    public JobsPage pressResetIcon() {
        clickElementByXpath(RESET_ICON);
        return new JobsPage();
    }
    public JobsPage pressJuniorButton() {
        clickElementByXpath(JUNIOR_BUTTON);
        return new JobsPage();
    }
    public JobsPage pressMidButton() {
        clickElementByXpath(MID_BUTTON);
        return new JobsPage();
    }
    public JobsPage pressSeniorButton() {
        clickElementByXpath(SENIOR_BUTTON);
        return new JobsPage();
    }
    public JobsPage pressManagerButton() {
        clickElementByXpath(MANAGER_BUTTON);
        return new JobsPage();
    }



}

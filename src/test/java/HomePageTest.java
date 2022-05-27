import Pages.AboutUsPage;
import Pages.HomePage;
import Pages.JobsPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends UseCaseBase {


    private static HomePage homePage;
    private static final Logger logger = LogManager.getLogger(HomePageTest.class);


    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();


    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToHomePage();


    }

    @Test
    public void homePageLoadTest() {
        logger.info(("Home page load test"));

        Boolean success = homePage.isLogoVisible();
        homePage.takeScreenshot("HomePageTest");
        assertTrue(success);
    }


    @Test
    public void openAboutUsPage() throws InterruptedException {
        AboutUsPage aboutUsPage = homePage.openAboutUsTab();
        Thread.sleep(2000);
        boolean isLoaded = aboutUsPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }


    @Test
    public void TorontoTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populateLocation("Toronto");
        jobsPage.pressSearchIcon();

        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void TelAvivTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populateLocation("Tel Aviv-Yafo");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void NewYorkTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populateLocation("New York");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void ChicagoTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populateLocation("Chicago");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }


    @Test
    public void QATest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populatePosition("QA");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void developerTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populatePosition("Developer");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void ProjectManagerTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populatePosition("Project Manager");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void company1Test() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populateCompany("Apple");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }
    @Test
    public void company2Test() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populateCompany("Facebook");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }
    @Test
    public void company3Test() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populateCompany("Google");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }
    @Test
    public void combinedTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populatePosition("Manager");
        jobsPage.populateLocation("USA");
        jobsPage.populateCompany("Google");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }
    @Test
    public void errorTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populatePosition("abracadabra");
        jobsPage.pressSearchIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }
    @Test
    public void resetTest() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populatePosition("Product manager");
        jobsPage.populateLocation("Chicago");
        jobsPage.populateCompany("Apple");
        Thread.sleep(5000);
        jobsPage.pressResetIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }
    @Test
    public void reset1Test() throws InterruptedException {
        JobsPage jobsPage = homePage.openJobsMenu();
        Thread.sleep(5000);
        jobsPage.populateUser("lubkin");
        jobsPage.populatePassword("123456");
        jobsPage.openLogInIcon();
        Thread.sleep(5000);
        jobsPage.populatePosition("QA");
        jobsPage.populateLocation("Toronto");
        jobsPage.populateCompany("Veeva Systems");
        jobsPage.populateDescription("lead");
        Thread.sleep(5000);
        jobsPage.pressJuniorButton();
        jobsPage.pressMidButton();
        jobsPage.pressSeniorButton();
        jobsPage.pressManagerButton();
        Thread.sleep(5000);
        jobsPage.pressResetIcon();
        Thread.sleep(5000);
        boolean isLoaded = jobsPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }


}
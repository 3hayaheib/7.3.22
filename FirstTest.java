package tests;

import Pages.BasePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.lang.model.element.PackageElement;
import java.io.IOException;

import static org.testng.Assert.assertNotNull;


public class FirstTest extends BasePage {


    @BeforeTest
    public void setUp(){
    super.setUp();
}
    @Test (priority =1 )
    public void LinkToTheAceWebsite(){
        homePage.Button("ACE");
        assertNotNull(utilities.getElement(searchPage.GoogleAndALinkToTheAceWebsite(),));
    }

    @Test (priority = 2)
    public void searchforProducts(){
        homePage.searchInput("Products" );
        assertNotNull(utilities.waitForElement(searchPage.WebsiteSearchBar(), 20));

    }
    @Test (priority = 3)
    public void Buttons(){
        homePage.Button("Button To The Page");
        assertNotNull(utilities.waitForElement(searchPage.ButtonsOnTheWebSite(),30));
    }

    @Test (priority = 4)
    public void Arrows (){
     homePage.Button("Arrows to the ace");
     assertNotNull(utilities.selectFromTheList(searchPage.ArrowsWithinTheSite(),10));

    }

    @Test (priority =5)
    public void PossibilityOfBrowsing() {
        homePage.Button("Browsing Site");
        assertNotNull(utilities.waitForElement(searchPage.PresentsThePossibilityOfBrowsing(), 25));


        @Test(priority = 6)
        public void RegisterToAce() {
            homePage.submit("name");
            assertNotNull(utilities.waitForElement(searchPage.RegisterToAceSite(), 15));
        }

        @Test(priority = 7)
        public void SearchListContent;() {
            homePage.Button("bikes");
            assertNotNull(utilities.selectFromTheList(searchPage.SearchListContent(), 30));

        }

        @Test(priority = 8)
        public void SelectTheActivityOptions; () {
            homePage.searchInput("select Activity Options");
            assertNotNull(utilities.selectFromTheList(searchPage.SelectTheActivityOptions(), 30));
        }
    }


        public void tearDown () throws IOException {
            utilities.screenshot();
            super.tearDown();
        }
    }
3


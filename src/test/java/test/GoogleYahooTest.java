package test;

import base.GoogleYahooBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.GooglePage;
import page.SearchPage;
import page.YahooPage;

public class GoogleYahooTest extends GoogleYahooBase {
    private GooglePage googlePage;
    private SearchPage searchPage;
    private YahooPage yahooPage;


    @Before
    public void setupTest() {
        googlePage = new GooglePage();
        searchPage = new SearchPage();
        yahooPage = new YahooPage();
    }


    @Test
    public void test2() {
        googlePage.method2();
        searchPage.clickYahoo();
        Assert.assertTrue(yahooPage.checkImage());

    }




}


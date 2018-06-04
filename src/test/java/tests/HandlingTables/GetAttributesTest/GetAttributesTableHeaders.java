package tests.HandlingTables.GetAttributesTest;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetAttributesTableHeaders extends BaseTest {

    //Col locators
    public By co11 = By.xpath("//th[contains(.,'Lorem')]");
    public By col2 = By.xpath("//th[contains(.,'Ipsum')]");
    public By col3 = By.xpath("//th[contains(.,'Dolor')]");
    public By col4 = By.xpath("//th[contains(.,'Sit')]");
    public By col5 = By.xpath("//th[contains(.,'Amet')]");
    public By col6 = By.xpath("//th[contains(.,'Diceret')]");
    public By col7 = By.xpath("//th[contains(.,'Action')]");
    //Result
    public By Result = By.xpath(".//*[@id='canvas']");
    String testurl = ("http://the-internet.herokuapp.com/challenging_dom");

    //Go to the test URL
//TODO Add test url to testdata
    @BeforeClass
    public void setUp() {
        driver.get(testurl);
    }

    //Col1
    @Test
    public void getAttribute_ButtonText_col1() {
        String co11IdText = driver.findElement(co11).getText();
        System.out.println("col1 button text " + co11IdText);
        Assert.assertEquals(co11IdText, "Lorem");
    }

    @Test
    public void getAttribute_ButtonText_col2() {
        String co12IdText = driver.findElement(col2).getText();
        System.out.println("col2 button text " + co12IdText);
        Assert.assertEquals(co12IdText, "Ipsum");
    }

    @Test
    public void getAttribute_ButtonText_col3() {
        String col3IdText = driver.findElement(col3).getText();
        System.out.println("col3 button text " + col3IdText);
        Assert.assertEquals(col3IdText, "Dolor");
    }

    @Test
    public void getAttribute_ButtonText_col4() {
        String col4IdText = driver.findElement(col4).getText();
        System.out.println("col4 button text " + col4IdText);
        Assert.assertEquals(col4IdText, "Sit");
    }

    @Test
    public void getAttribute_ButtonText_col5() {
        String col5IdText = driver.findElement(col5).getText();
        System.out.println("col5 button text " + col5IdText);
        Assert.assertEquals(col5IdText, "Amet");
    }

    @Test
    public void getAttribute_ButtonText_col6() {
        String col6IdText = driver.findElement(col6).getText();
        System.out.println("col6 button text " + col6IdText);
        Assert.assertEquals(col6IdText, "Diceret");
    }

    @Test
    public void getAttribute_ButtonText_col7() {
        String col7IdText = driver.findElement(col7).getText();
        System.out.println("col7 button text " + col7IdText);
        Assert.assertEquals(col7IdText, "Action");
    }

}



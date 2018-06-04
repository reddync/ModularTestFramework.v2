package tests.HandlingTables.TableTests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;


public class TablesNoOfColumnsAndRows extends BaseTest {
    public void main() {

        driver.get("http://the-internet.herokuapp.com/challenging_dom");

//PAGE
//No.of Columns
        List col = driver.findElements(By.xpath(".//*[@id='content']/div/div/div/div[2]/table/thead/tr/th"));
        System.out.println("No of cols are : " + col.size());
//No.of rows
        List rows = driver.findElements(By.xpath(".//*[@id='content']/div/div/div/div[2]/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + rows.size());

//using if else and .equal, see other version for using assert equals

//Rows
        String actualrows = String.valueOf(+rows.size());
        String expectedrows = "10";
        Assert.assertEquals(actualrows, expectedrows);
//Cols
        String expectedcol = String.valueOf(+col.size());
        String actualcol = "7";

//Asserts
        Assert.assertEquals(actualrows, expectedrows);

        Assert.assertEquals(actualcol, expectedcol);

        if (expectedrows.equals(actualrows)) {
            System.out.println("Rows Match PASS");
        } else {
            System.out.println("Rows Don't match FAIL");
        }
        if (expectedcol.equals(actualcol)) {
            System.out.println("Columns Match PASS");
        } else {
            System.out.println("Columns Don't match FAIL");
        }
        driver.close();

    }
}

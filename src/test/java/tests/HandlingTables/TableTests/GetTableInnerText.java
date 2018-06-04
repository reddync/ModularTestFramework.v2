package tests.HandlingTables.TableTests;

import base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ExtentReports.ExtentTestManager;

import static org.testng.Assert.assertTrue;

public class GetTableInnerText extends BaseTest {

    @Test
    public void GetTableInnerTextCol1() {
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret0')]")).getText().contains("Iuvaret"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret1')]")).getText().contains("Iuvaret1"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret2')]")).getText().contains("Iuvaret2"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret3')]")).getText().contains("Iuvaret3"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret4')]")).getText().contains("Iuvaret4"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret5')]")).getText().contains("Iuvaret5"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret6')]")).getText().contains("Iuvaret6"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret7')]")).getText().contains("Iuvaret7"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret8')]")).getText().contains("Iuvaret8"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Iuvaret9')]")).getText().contains("Iuvaret9"));

        System.out.println("All  rows in col1 'Lorem' contain the word Iuvart");
        ExtentTestManager.getTest().log(LogStatus.INFO, "All  rows in col1 'Lorem' contain the word Iuvart");
    }

    @Test
    public void GetTableInnerTextCol2() {
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian0')]")).getText().contains("Apeirian"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian1')]")).getText().contains("Apeirian1"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian2')]")).getText().contains("Apeirian2"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian3')]")).getText().contains("Apeirian3"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian4')]")).getText().contains("Apeirian4"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian5')]")).getText().contains("Apeirian5"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian6')]")).getText().contains("Apeirian6"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian7')]")).getText().contains("Apeirian7"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian8')]")).getText().contains("Apeirian8"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Apeirian9')]")).getText().contains("Apeirian9"));

        System.out.println("All rows in col2 'Ipsum' contain the word Apeirian");
        ExtentTestManager.getTest().log(LogStatus.INFO, "AAll rows in col2 'Ipsum' contain the word Apeirian");
    }

    @Test
    public void GetTableInnerTextCol3() {
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci0')]")).getText().contains("Adipisci0"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci1')]")).getText().contains("Adipisci1"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci2')]")).getText().contains("Adipisci2"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci3')]")).getText().contains("Adipisci3"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci4')]")).getText().contains("Adipisci4"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci5')]")).getText().contains("Adipisci5"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci6')]")).getText().contains("Adipisci6"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci7')]")).getText().contains("Adipisci7"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci8')]")).getText().contains("Adipisci8"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci9')]")).getText().contains("Adipisci9"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Adipisci1')]")).getText().contains("Adipisci1"));
        System.out.println("All rows in col3 'Dolor' contain the word Adipisci");
        ExtentTestManager.getTest().log(LogStatus.INFO, "All rows in col3 'Dolor' contain the word Adipisci");
    }

    @Test
    public void GetTableInnerTextCol4() {
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas0')]")).getText().contains("Definiebas"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas1')]")).getText().contains("Definiebas1"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas2')]")).getText().contains("Definiebas2"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas3')]")).getText().contains("Definiebas3"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas4')]")).getText().contains("Definiebas4"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas5')]")).getText().contains("Definiebas5"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas6')]")).getText().contains("Definiebas6"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas7')]")).getText().contains("Definiebas7"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas8')]")).getText().contains("Definiebas8"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Definiebas9')]")).getText().contains("Definiebas9"));

        System.out.println("All rows in col4 'Sit' contain the word Definiebas");
        ExtentTestManager.getTest().log(LogStatus.INFO, "All rows in col4 'Sit' contain the word Definiebas");
    }

    @Test
    public void GetTableInnerTextCol5() {
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur0')]")).getText().contains("Consequuntur0"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur1')]")).getText().contains("Consequuntur1"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur2')]")).getText().contains("Consequuntur2"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur3')]")).getText().contains("Consequuntur3"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur4')]")).getText().contains("Consequuntur4"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur5')]")).getText().contains("Consequuntur5"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur6')]")).getText().contains("Consequuntur6"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur7')]")).getText().contains("Consequuntur7"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur8')]")).getText().contains("Consequuntur8"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Consequuntur9')]")).getText().contains("Consequuntur9"));

        System.out.println("All rows in col5 'Amet' contain the word Consequuntur");
        ExtentTestManager.getTest().log(LogStatus.INFO, "All rows in col5 'Amet' contain the word Consequuntur");
    }

    @Test
    public void GetTableInnerTextCol6() {
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum0')]")).getText().contains("Phaedrum0"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum1')]")).getText().contains("Phaedrum1"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum2')]")).getText().contains("Phaedrum2"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum3')]")).getText().contains("Phaedrum3"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum4')]")).getText().contains("Phaedrum4"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum5')]")).getText().contains("Phaedrum5"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum6')]")).getText().contains("Phaedrum6"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum7')]")).getText().contains("Phaedrum7"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum8')]")).getText().contains("Phaedrum8"));
        assertTrue(driver.findElement(By.xpath("//td[contains(.,'Phaedrum9')]")).getText().contains("Phaedrum9"));

        System.out.println("All rows in col6 'Diceret' contain the word Phaedrum");
        ExtentTestManager.getTest().log(LogStatus.INFO, "All rows in col6 'Diceret' contain the word Phaedrum");
    }

}



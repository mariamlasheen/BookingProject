package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class BookPage extends BasePage {
    public BookPage(WebDriver driver) {
        super(driver);
    }
    By FromBox = By.id("fromPlaceName");
    By toBox = By.xpath("//input[@id='toPlaceName']");
    By dateFrom = By.id("txtJourneyDate");
    By SearchButton = By.cssSelector(".btn.btn-primary.btn-lg.btn-block.btn-booking");
    By firstCountry = By.xpath(setXpathByText("CHIKKAMAGALURU"));
    By toCountry = By.xpath(setXpathByText("BENGALURU"));
    By ChooseDay = By.xpath("//a[contains(text(),'31')]");
    By SelectSeatButton = By.xpath("//body/main[1]/form[1]/section[1]/div[1]/div[6]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[4]");
    By seatNumber = By.xpath("//span[@class='seatNumber'][normalize-space()='27']");
    By chooseBoardPoint = By.xpath("//div[@class='header-top-menu']");
    By dropPoint= By.xpath("//ul/li[contains(@class,'p-2 Forward-droping active1')]");
    By mobnumber = By.id("mobileNo");
    By name = By.id("passengerNameForward0");
    By email = By.id("email");
    By Gender = By.name("genderCodeId"); //select
    By age = By.id("passengerAgeForward0");
    By consession = By.id("concessionIdsForward0"); //select
    By makepayment= By.id("PgBtn");
    By Card = By.cssSelector("button[method='card'] div[class='stack svelte-1qs47py horizontal']");
    By cardId = By.id("card_number");
    By cardexp = By.id("card_expiry");
    By cardcvv= By.id("card_cvv");
    By open =By.cssSelector("a[data-target='#ForwardinPxInfoDv']");



    public void setFrom() throws InterruptedException {
        setText(FromBox,"CHIKKAMAGALURU");
        click(firstCountry);
    }
    public void setTo() throws InterruptedException {
        // setText(toBox,"BENGALURU");
        click(toBox);
        click(toCountry);

    }
    public void chooseDay() throws InterruptedException {
        click(dateFrom);
        click(ChooseDay);

    }

    public void clickOnSearch() throws InterruptedException {
        click(SearchButton);
    }
    public void SelectSeat() throws InterruptedException {
        click(SelectSeatButton);
    }
    public void scroll(){
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
    public void selectSet() throws InterruptedException {
        click(seatNumber);
    }
    public void clickChooseBoardPointAndDropPoint() throws InterruptedException {
        click(chooseBoardPoint);
        click(dropPoint);
    }
    public void EnterData() throws InterruptedException {
        setText(mobnumber,"6789125987");
        setText(email,"mariamlashen8@gmail.com");
        scroll();
        click(open);
        setText(name,"mariam");
        selectByVisibleText(Gender,"FEMALE");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        setText(age,"23");
        selectByVisibleText(consession,"GENERAL PUBLIC");
        click(makepayment);
    }
    public void cardInfo() throws InterruptedException {
        click(Card);
        setText(cardId,"1234567891259746");
        setText(cardexp,"1227");
        setText(cardcvv,"111");
    }

}

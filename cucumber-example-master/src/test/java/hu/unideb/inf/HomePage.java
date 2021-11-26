package hu.unideb.inf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HomePage {

    private static final String PAGE_URL = "http://automationpractice.com/";
    private  final String NEXT_PAGE_URL = "https://www.facebook.com/groups/525066904174158/";

    public String getNEXT_PAGE_URL() {
        return NEXT_PAGE_URL;
    }

    private static final By LOGIN_ERROR = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
    private static final By CONTACT_ERROR = By.cssSelector("#center_column > div > ol > li");
    private static final By EMAIL_ERROR = By.xpath("//p[contains(text(),'Newsletter : Invalid email address.')]");
    private static final By SEARCH_ERROR = By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 > p.alert.alert-warning");
    private static final By CART_ERROR = By.xpath("//p[contains(text(),'Your shopping cart is empty.')]");
    private static final By ADD_TO_CART = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/h2[1]");
    private static final By CREATE_AN_ACCOUNT = By.xpath("//li[contains(text(),'Invalid email address.')]");
    private static final By REGISTER = By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.alert.alert-danger > p:nth-child(1)");
    private static final By SEARCH = By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 h1.page-heading.product-listing:nth-child(1) > span.heading-counter");
    private static final By HOVER_OVER_ITEM = By.xpath("product-container");


    public By hoverOver(){
        return By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]");
    }


    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getMenu(By by){
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);                     //check
        actions.moveToElement(element);
        actions.build().perform();
    }

/*
    public static void switchTabs(WebDriver driver, int expectedWindowsCount,int SwitchtoWindow) throws Exception {
        (new WebDriverWait(driver, 30)).until(ExpectedConditions.numberOfWindowsToBe(expectedWindowsCount));
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(SwitchtoWindow));
    }

 */

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    private WebElement registerButton;

    public WebElement getRegisterButton() {
        return registerButton;
    }

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    private WebElement createAccButton;

    public WebElement getCreateAccButton() {
        return createAccButton;
    }

    @FindBy(id = "email_create")
    private WebElement eAdress;

    public WebElement geteAdress() {
        return eAdress;
    }

    @FindBy(xpath = "//body/div[@id='page']/div[3]/footer[1]/div[1]/section[1]/ul[1]/li[1]/a[1]")
    private WebElement fbLink;

    public WebElement getFbLink() {
        return fbLink;
    }

    @FindBy(className = "replace-2x img-responsive")         //check
    private WebElement menu;


    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]/span[1]")
    private WebElement addToCard;             //check

    public WebElement getAddToCard() {
        return addToCard;                 //check
    }

    public WebElement getProceedToCheckOut() {
        return proceedToCheckOut;            //check
    }

    public WebElement getProceed() {         //check
        return proceed;
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    private WebElement Tshirt;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElement addToCart;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    private WebElement list;


    public WebElement getList() {
        return list;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getTshirt() {
        return Tshirt;
    }



    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    private WebElement proceedToCheckOut;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
    private WebElement proceed;


    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]")
    private WebElement cartButton;

    public WebElement getCartButton() {
        return cartButton;
    }

    @FindBy(name = "submitNewsletter")
    private WebElement mainPageEmailButton;


    @FindBy(id = "newsletter-input")
    private WebElement mainPageEmailLink;

    public WebElement getMainPageEmailButton() {
        return mainPageEmailButton;
    }

    public void clickEmailLink() {
        mainPageEmailLink.click();
    }

    public void clickEmailButton() {
        mainPageEmailButton.click();
    }

    public WebElement getSearchButton() {    //searchButton getter
        return searchButton;
    }

    @FindBy(name="submit_search")
    private WebElement searchButton;       //searchButton

    @FindBy(className = "login")
    private WebElement signInLink;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(id = "contact-link")
    private WebElement contactUsLink;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;


    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void openNextPage() {
        driver.get(NEXT_PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }


    public Optional<String> getLoginError() {
        return getErrorMessage(LOGIN_ERROR);
    }

    public Optional<String> getContactError() {
        return getErrorMessage(CONTACT_ERROR);
    }

    public Optional<String> getEmailError() {
        return getErrorMessage(EMAIL_ERROR);
    }

    public Optional<String> getSearchError() {
        return getErrorMessage(SEARCH_ERROR);
    }

    public Optional<String> getCartError() {
        return getErrorMessage(CART_ERROR);
    }

    public Optional<String> getAddToCartMSG(){return getErrorMessage(ADD_TO_CART);}

    public Optional<String> getCreateAccount(){return getErrorMessage(CREATE_AN_ACCOUNT);}

    public Optional<String> getRegister(){return getErrorMessage(REGISTER);}

    public String getSearch(){return getErrorMessage(SEARCH).get();}










    public void fillField(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    private Optional<String> getErrorMessage(By errorLocator) {
        Optional<WebElement> error = getError(errorLocator);
        if (error.isPresent()) {
            WebElement errorElement = error.get();
            return Optional.of(errorElement.getText());
        } else {
            return Optional.empty();
        }
    }

    private Optional<WebElement> getError(By errorLocator) {
        List<WebElement> elements = driver.findElements(errorLocator);
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }

    public void assertURL(String expectedUrl){
        driver.get(expectedUrl);
        try {
            Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
            System.out.println("Correct Page");
        }
        catch (Throwable pageNavigationError) {
            System.out.println("Incorrect page");
        }
    }

}

package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreHomePage extends PageBaseStore {

    public StoreHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String SIGN_IN_BUTTON_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String CREATE_ACCOUNT_BUTTON_CSS_SELECTOR = "#SubmitCreate";
    private final String SIGNIN_BUTTON_CSS_SELECTOR = "#SubmitLogin";
    private final String REGISTER_BUTTON_ID = "submitAccount";
    private final String SLIDER_HOME_ID = "slider_row";
    private final String H1_TITLE_CSS_SELECTOR = "#center_column > h1";
    private final String EMAIL_INPUT_CREATE_CSS_SELECTOR = "#email_create";
    private final String EMAIL_INPUT_LOGIN_CSS_SELECTOR = "#email";
    private final String FORM_CSS_SELECTOR = "#noSlide > h1";
    private final String TSHIRTS_BUTTON_CSS_SELECTOR = "#block_top_menu > ul > li:nth-child(3) > a";
    private final String ITEM_BUTTON_CSS_SELECTOR = "#center_column > ul > li > div > div.right-block > h5 > a";
    private final String H1_CSS_SELECTOR = "#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1";
    private final String ADDTOCART_BUTTON_ID = "add_to_cart";
    private final String ITEM_ADDED_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2";
    private final String H1_TITLE_ID = "cart_title";
    private final String CHECKOUT_BUTTON_CSS_SELECTOR = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium";
    private final String CHECKOUT2_BUTTON_CSS_SELECTOR = "#center_column > form > p > button > span";
    private final String H1_SHIPPING_CSS_SELECTOR = "#carrier_area > h1";
    private final String CHECKOUT3_BUTTON_CSS_SELECTOR = "#form > p > button > span";
    private final String TERMS_CHECKBOX_CSS_SELECTOR = "#uniform-cgv";
    private final String PAYMENT_BUTTON_CSS_SELECTOR = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a";
    private final String CONFIRM_BUTTON_CSS_SELECTOR = "#cart_navigation > button > span";
    private final String CONFIRMATION_CSS_SELECTOR = "#center_column > div > p > strong";


    public void go(){
        navigateToCompleteURL();
    }

    public void verificarHome(){
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(SLIDER_HOME_ID)), "El elemento no es visible");
    }

    public void clickButton(String button){
        switch (button){
            case "Sign in":
                loginButtonClick();
                break;
            case "Create an account":
                createAnAccountButton();
                break;
            case "Register":
                registerButton();
                break;
            case "TSHIRTS":
                tshirtsButton();
                break;
            case "ITEM":
                itemButton();
                break;
            case "AddToCart":
                AddToCart();
                break;
            case "GotoCheckout":
                GotoCheckout();
                break;
            case "GotoCheckout2":
                GotoCheckout2();
                break;
            case "GotoCheckout3":
                GotoCheckout3();
                break;
            case "GotoCheckout4":
                GotoCheckout4();
                break;
            case "Checkbox":
                Checkbox();
                break;
            case "PayByBank":
                PayByBank();
                break;
            case "Confirm":
                Confirm();
                break;
        }
    }

    public void GotoCheckout() {
        String CHECKOUT1_BUTTON_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a";
        clickElement(By.cssSelector(CHECKOUT1_BUTTON_CSS_SELECTOR));
    }

    public void loginButtonClick(){
        if (isElementPresent(By.cssSelector(SIGN_IN_BUTTON_CSS_SELECTOR)) && isElementPresent(By.cssSelector(SIGNIN_BUTTON_CSS_SELECTOR))){
            clickElement(By.cssSelector(SIGNIN_BUTTON_CSS_SELECTOR));
        }
        if (isElementVisible(By.cssSelector(SIGN_IN_BUTTON_CSS_SELECTOR))){
            click("store.signin_button");
        }
    }

    public void createAnAccountButton(){
        clickElement(By.cssSelector(CREATE_ACCOUNT_BUTTON_CSS_SELECTOR));
    }

    public void registerButton(){
        clickElement(By.id(REGISTER_BUTTON_ID));
    }

    public void AddToCart(){
        clickElement(By.id(ADDTOCART_BUTTON_ID));
    }

    public void Checkbox(){
        clickElement(By.cssSelector(TERMS_CHECKBOX_CSS_SELECTOR));
    }

    public void redirectScreen(String pantalla){
        switch (pantalla){
            case "Login":
                verifyLoginScreen();
                break;
            case "My Account":
                verifyMyAccountScreen();
                break;
            case "Detailed Item":
                verifyDetailedItemScreen();
                break;
            case "ItemAdded":
                verifyItemAddedScreen();
                break;
            case "Summary":
                verifyH1Summary();
                break;
            case "Shipping":
                verifyH1Shipping();
                break;
            case "PaymentMethod":
                verifyPaymentScreen();
                break;
            case "Confirmation":
                verifyConfirmation();
                break;
        }
    }

    public void verifyLoginScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_TITLE_CSS_SELECTOR)).getText(),"AUTHENTICATION");
    }

    public void verifyPaymentScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_TITLE_CSS_SELECTOR)).getText(),"PLEASE CHOOSE YOUR PAYMENT METHOD");
    }

    public void verifyMyAccountScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_TITLE_CSS_SELECTOR)).getText(),"MY ACCOUNT");
    }

    public void verifyDetailedItemScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_CSS_SELECTOR)).getText(),"Faded Short Sleeve T-shirts");
    }

    public void verifyH1Summary(){
        Assert.assertEquals(getWebElement(By.id(H1_TITLE_ID)).getText(),"SHOPPING-CART SUMMARY");
    }

    public void verifyH1Shipping(){
        Assert.assertEquals(getWebElement(By.id(H1_SHIPPING_CSS_SELECTOR)).getText(),"SHIPPING");
    }

    public void verifyConfirmation(){
        Assert.assertEquals(getWebElement(By.cssSelector(CONFIRMATION_CSS_SELECTOR)).getText(),"Your order on My Store is complete.");
    }

    public void tshirtsButton(){
        clickElement(By.cssSelector(TSHIRTS_BUTTON_CSS_SELECTOR));
    }

    public void itemButton(){
        clickElement(By.cssSelector(ITEM_BUTTON_CSS_SELECTOR));
    }

    public void GotoCheckout2(){
        clickElement(By.cssSelector(CHECKOUT_BUTTON_CSS_SELECTOR));

    }
    public void GotoCheckout3() {
        clickElement(By.cssSelector(CHECKOUT2_BUTTON_CSS_SELECTOR));
    }

    public void GotoCheckout4() {
        clickElement(By.cssSelector(CHECKOUT3_BUTTON_CSS_SELECTOR));
    }

    public void PayByBank() {
        clickElement(By.cssSelector(PAYMENT_BUTTON_CSS_SELECTOR));
    }

    public void Confirm() {
        clickElement(By.cssSelector(CONFIRM_BUTTON_CSS_SELECTOR));
    }

    public void verifyItemAddedScreen(){
        waitForElementVisibility(By.cssSelector(ITEM_ADDED_CSS_SELECTOR));
        Assert.assertTrue(isElementPresentAndDisplayed(By.cssSelector(ITEM_ADDED_CSS_SELECTOR)), "El elemento no se visualizó");
    }

    public void enterEmail(String email) {
        completeField(By.cssSelector(EMAIL_INPUT_CREATE_CSS_SELECTOR), email);
        completeField(By.cssSelector(EMAIL_INPUT_LOGIN_CSS_SELECTOR), email);
    }
}

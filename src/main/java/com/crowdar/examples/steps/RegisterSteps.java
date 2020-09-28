package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.examples.pages.RegisterPage;
import com.crowdar.examples.pages.CheckoutFlowPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class RegisterSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina de Home")
    public void elClienteSeEncuentraEnLaPaginaDeHome() {
        Injector._page(CheckoutFlowPage.class).go();
    }

    @When("el cliente hace click en el botón (.*)")
    public void elClienteHaceClickEnElBotónSignIn(String button) {
        Injector._page(CheckoutFlowPage.class).clickButton(button);
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla de (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeLogin(String pantalla) {
        Injector._page(CheckoutFlowPage.class).redirectScreen(pantalla);
    }

    @When("el cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmailTestingTestCom(String email) {
        Injector._page(CheckoutFlowPage.class).enterEmail(email);
    }

    @When("el cliente ingresa sus datos personales: Title: (.*), First name: (.*), Last name: (.*), Password: (.*), Date of Birth (.*)")
    public void elClienteIngresaSusDatosPersonalesTitleMrFirstNameJoelLastNameVitelliPasswordTestingDateOfBirth(String title, String fName, String lName, String pass, String birth) {
        Injector._page(RegisterPage.class).completePersolanInformation(title, fName, lName, pass, birth);
    }

    @And("el cliente ingresa sus datos de dirección: Company: (.*), Address: (.*), City: (.*), State: (.*), Zip: (.*), Country: (.*), Mobile phone: (.*), Alias: (.*)")
    public void elClienteIngresaSusDatosDeDirecciónCompanyCrowdarAddressBuenosAiresCityAlbuquerqueStateNewMexicoZipCountryUnitedStatesMobilePhoneAliasDirecciónJoel(String company, String address, String city, String state, String zip, String country, String phone, String alias) {
        Injector._page(RegisterPage.class).completeAddressInformation(company, address, city, state, zip, country, phone, alias);
    }

}

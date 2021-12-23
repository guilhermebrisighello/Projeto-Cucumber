package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

import static runners.RunCucumberTest.driver;


public class DescontosStep {

    HomePage homePage = new HomePage(driver);

    @Dado("que estou no site da qazando")
    public void acessar_site_qazando(){
        homePage.acessarAplicacao();
    }

    @Quando("eu desço a página")
    public void descer_a_pagina() throws InterruptedException {
        homePage.scrollDown();
    }

    @Quando("eu preencho meu email")
    public void preencher_email() {
        homePage.preenhceEmail();
    }

    @Quando("clico no botão ganhar cupom")
    public void clicar_em_ganhar_cupom() {
        homePage.clickGanharDesconto();
    }

    @Então("eu vejo o código de desconto")
    public void vejo_codigo_de_desconto(){
        homePage.verificarCupomDesconto();
    }

}

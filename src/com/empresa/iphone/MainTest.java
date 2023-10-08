package com.empresa.iphone;

import com.empresa.iphone.modelo.Iphone;

public class MainTest {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Teste do Reprodutor Musical
        System.out.println("Testando Reprodutor Musical...");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Teste do Aparelho Telefônico
        System.out.println("\nTestando Aparelho Telefônico...");
        meuIphone.ligar("1234567890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste do Navegador na Internet
        System.out.println("\nTestando Navegador na Internet...");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

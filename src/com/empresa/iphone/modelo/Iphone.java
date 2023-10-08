
package com.empresa.iphone.modelo;

//importa os pacotes onde estão as isterfaces
import com.empresa.iphone.navegador.NavegadorInternet;
import com.empresa.iphone.reprodutor.ReprodutorMusical;
import com.empresa.iphone.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    //foi usado um print para simular o funcionamento de cada metódo
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println(nomeMusica + " tocando");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Telefone atendido");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo conteúdo da url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página adicionada!");
    }
}


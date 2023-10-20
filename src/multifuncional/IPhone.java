package multifuncional;

import navegador.NavegadorInternet;
import reprodutor_de_musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando a música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Pausando a música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void fecharAba() {
        System.out.println("Aba fechada.");
    }
}


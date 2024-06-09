import FuncoesBase.AparelhoTelefonico;
import FuncoesBase.NavegadorInternet;
import FuncoesBase.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("----TELEFONE----");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("999000999");

        System.out.println("----MUSICA----");
        iphone.selecionarMusica("Houdini");
        iphone.tocar();
        iphone.pausar();

        System.out.println("----INTERNET----");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("web.dio.me");
        iphone.atualiazarPagina();
    }


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para correio de voz");
    }

    @Override
    public void atualiazarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo " + url);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica: " + musica + " selecionada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }
}
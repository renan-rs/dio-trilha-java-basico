import internet.Internet;
import music_player.MusicPlayer;
import phone.Phone;

public class IPhone implements Internet, MusicPlayer, Phone{

    @Override
    public void exibirPagina() {
        System.out.println("Internet - exibindo a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Internet - adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Internet - atualizando a página");
    }

    @Override
    public void tocar() {
        System.out.println("Music - está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Music - pausou a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Music - selecionou uma música");
    }

    @Override
    public void ligar() {
        System.out.println("Phone - está ligando");
    }

    @Override
    public void atender() {
        System.out.println("Phone - atendeu uma chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Phone - iniciou correio de voz");
    }

}

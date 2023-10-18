package music_player;

public class PlayerLegal implements MusicPlayer{

    @Override
    public void tocar() {
        System.out.println("Music Player Legal está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Music Player Legal pausou a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Music Player Legal selecionou uma música");
    }
    
}

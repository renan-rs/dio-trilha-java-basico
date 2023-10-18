package internet;

public class BrowserChrome implements Internet{

    @Override
    public void exibirPagina() {
        System.out.println("Browser Chrome exibindo a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Browser Chrome adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Browser Chrome atualizando a página");
    }
    
}

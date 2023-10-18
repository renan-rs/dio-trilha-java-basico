package phone;

public class ContactsApp implements Phone{

    @Override
    public void ligar() {
        System.out.println("Aplicativo de Contatos está ligando");
    }

    @Override
    public void atender() {
        System.out.println("Aplicativo de Contatos atendeu uma chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Aplicativo de Contatos iniciou correio de voz");
    }
    
}

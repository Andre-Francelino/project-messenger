package ProjectMessenger;

public class FacebookMessenger {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook \n");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da Mensagem");
    }

}

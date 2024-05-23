package ProjectMessenger;

public class Telegram {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram \n");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da Mensagem");
    }

}

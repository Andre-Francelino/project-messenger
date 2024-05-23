package ProjectMessenger;

public class ServicoMensagemInstantanea {

    public void enviarMensagem() {
        // confirmando se o usuário está conectado à internet
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        // após o envio a mensagem é salva no histórico
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem \n");
    }

    // métodos privados, visiveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da Mensagem");
    }

}

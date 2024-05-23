package ProjectMessenger;

public class MSNMessenger {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pele MSN");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSN \n");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da Mensagem");
    }

}

package ProjectMessenger;

public class ComputadorUsuario {
    public static void main(String[] args) {

        // abrindo o MSN
        MSNMessenger msn = new MSNMessenger();
        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();

    }
}

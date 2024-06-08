package ProjectMessenger.apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();


    /*
        método com o modificador de acesso PROTECTED: método visível apenas para as classes filhas
        de ServicoMensagemInstantanea e/ou que estão no mesmo package apps
    */
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet!");
    }

}

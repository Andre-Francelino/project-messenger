package ProjectMessenger;

public class ComputadorUsuario {
    public static void main(String[] args) {

        // abrindo o MSN
        System.out.println("==== MSN MESSENGER ====");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        // abrindo o Facebook
        System.out.println("==== FACEBOOK MESSENGER ====");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        // abrindo o Telegram
        System.out.println("==== TELEGRAM ====");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}

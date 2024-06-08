package ProjectMessenger;

import ProjectMessenger.apps.FacebookMessenger;
import ProjectMessenger.apps.MSNMessenger;
import ProjectMessenger.apps.ServicoMensagemInstantanea;
import ProjectMessenger.apps.Telegram;

public class UserComputer {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        /* 			"AULA POLIMORFISMO"
		 	Não se sabe qual aplicativo de mensagem será usado.
		 	Mas independente do escolhido, deve ser enviado e recebido a mensagem
		*/
        String aplicativoEscolhido = "msn";
        
        if (aplicativoEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (aplicativoEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (aplicativoEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}

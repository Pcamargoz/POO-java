package APPS;

public class Telegram  extends Servicopai {

    public void validarInternet(){
        
        System.out.println("Vendo se esta conectado a internet");
    }
    
    public void enviarMensagem(){
        
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){

        System.out.println("Recebendo mensagem pelo Telegram");
    }
    public void salvarHistoricoMensagem(){
        System.out.println("Salvando seu historico da conversa Telegram");

    }
}


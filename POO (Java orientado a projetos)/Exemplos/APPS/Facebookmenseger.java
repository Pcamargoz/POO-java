package APPS;

public class Facebookmenseger extends Servicopai {
    
    public void validarInternet(){
        
        System.out.println("Vendo se esta conectado a internet");
    }
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo FacebookMenseger");
    }
    public void receberMensagem(){

        System.out.println("Recebendo mensagem pelo FacebookMenseger");;
    }
    public void salvarHistoricoMensagem(){
        System.out.println("Salvando seu historico da conversa Facebook");

    }
}

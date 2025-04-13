package Aplicativos;
import APPS.Facebookmenseger;
import APPS.MSNmenseger;
import APPS.Servicopai;
import APPS.Telegram;
import java.util.Scanner;
public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Servicopai srp = null;
        /* 
         *  Não se sabe qual app 
         * Mas qualquer um devera enviar e receber mensagem 
         *  
         */
        System.out.println("Digite seu app que ira usar:");
        String appEscolhido = scan.next();
        
        // POLIMORFISMO 
         if(appEscolhido.equals("MSN"))
            srp = new MSNmenseger();
        else if(appEscolhido.equals("FACE"))
            srp = new Facebookmenseger();
        else if(appEscolhido.equals("TLG"))
            srp = new Telegram();
    
        srp.enviarMensagem();
        srp.receberMensagem();
        

      
}
}
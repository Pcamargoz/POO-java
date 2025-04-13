package APPS;

public abstract class Servicopai {

    
    // Todos so vai so vai ser filho do metodo se tiver os metodos abrstacta
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    public abstract void salvarHistoricoMensagem();

    // Somente os filhos conhecem esse codigo 
    protected void validarConectadoInternet(){
        System.out.println("Vendo se esta conectado a internet");
    }

}


package Carros;
public class carro extends veiculo {
    // ta extendendo a classe veiculo para que os metodos de la possam ser usados aqui 
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }
     // PRIVADO O QUE A GENTE NÃO PRECISA VER
    private void confereCombustivel () {
        System.out.println("Conferindo o combustivel");
    }
    // PRIVADO O QUE A GENTE NÃO PRECISA VER
    private void confereCambio() {
        System.out.println("Conferindo o cambio em P");
    }
}
package Carros;
public class autodromo{
    public static void main(String[] args) {

        carro jeep = new carro();
        jeep.setChassi("9819381");
        //jeep.ligar();

        moto z400 = new moto();
        z400.setChassi("23115");
        //z400.ligar();

        // CLASSE ABSTRATA QUE MOSTRA SOMENTE O QUE INDICA
        veiculo coringa = jeep;
        coringa.ligar();
    }
}
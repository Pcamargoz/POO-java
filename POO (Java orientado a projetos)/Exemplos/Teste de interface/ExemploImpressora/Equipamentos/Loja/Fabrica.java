package ExemploImpressora.Equipamentos.Loja;

import ExemploImpressora.Equipamentos.MultiFuncional.Multifuncional;
import ExemploImpressora.Equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {

        Impressora impressora = new Multifuncional();
        
        impressora.imprimir();
    }
}
package Carros;
public abstract class veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    // PRA ALGUMA CLASSE PODE USAR A VEICULO ELA TEM QUE LIGAR
    public abstract void ligar();
}

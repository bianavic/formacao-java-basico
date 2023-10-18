package edu.fabs.formacaoorientadaaobjetos.pilares.abstracao;

// CLASSE ABSTRATA pq NAO SABE como as coisas ou algumas das coisas acontecem
public abstract class Veiculo {

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // METODO ABSTRATO  pq nao sabe
    public abstract void ligar();

}

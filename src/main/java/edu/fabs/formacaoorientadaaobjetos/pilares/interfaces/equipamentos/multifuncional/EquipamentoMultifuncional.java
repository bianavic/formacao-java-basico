package edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.multifuncional;

import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.copiadora.Copiadora;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.impressora.Impressora;

// precisa ter 3 caracteristicas: copiar, imprimir e digitalizar
public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

    // sobreescrita - estou herdando de algum lugar o metodo
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

}

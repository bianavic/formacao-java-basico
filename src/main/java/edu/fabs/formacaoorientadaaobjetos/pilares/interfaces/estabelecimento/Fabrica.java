package edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.estabelecimento;

import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.copiadora.Copiadora;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.copiadora.Xerox;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.digitalizadora.Scanner;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.impressora.Deskjet;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.impressora.Impressora;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.impressora.Laserjet;
import edu.fabs.formacaoorientadaaobjetos.pilares.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

    public static void main(String[] args) {

        System.out.println("### impressoras ###");
        Impressora impressora1 = new Deskjet();
        impressora1.imprimir();
        Impressora impressora2 = new Laserjet();
        impressora2.imprimir();
        Impressora impressora3 = new EquipamentoMultifuncional();
        impressora3.imprimir();

        System.out.println("### copiadoras ###");
        Copiadora copiadora1 = new Xerox();
        copiadora1.copiar();
        Copiadora copiadora2 = new EquipamentoMultifuncional();
        copiadora2.copiar();

        System.out.println("### digitalizadoras ###");
        Digitalizadora digitalizadora1 = new Scanner();
        digitalizadora1.digitalizar();
        Digitalizadora digitalizadora2 = new EquipamentoMultifuncional();
        digitalizadora2.digitalizar();

        // pode representar qqer papel que defini dentro da estrutura de objetos
        System.out.println("### equipamento multifuncional ###");
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();

        }

}

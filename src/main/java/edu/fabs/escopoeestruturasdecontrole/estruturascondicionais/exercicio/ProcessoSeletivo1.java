package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.exercicio;

public class ProcessoSeletivo1 {

    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);
    }

    // metodo estatico, sem retorno
    // 2 parametros: salario pretendido e salario base
    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

}

package edu.fabs.escopoeestruturasdecontrole.estruturascondicionais.excepcionais;

public class FormatadorCepExemplo {

    // qdo tentar formatar o CEP
    // verifica, se cep |= 8 caracteres
    // lanca a excecao customizada
    public static void main(String[] args) {

        try {
            String cepFormatadoInvalido = formatarCep("123456"); // lança excecao: Caused by: CepInvalidoException
            String cepFormatado = formatarCep("12345678"); // retorna o valor return do metodo formatarCep: 23.765-064

            System.out.println(cepFormatadoInvalido);
        } catch (CepInvalidoException e) {
//            throw new RuntimeException(e);
            System.out.println("O cep nao corresponder às regras de negócio"); // em brancp
//            System.err.println("O cep nao corresponder às regras de negócio"); // em vermelho
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException(); // Caused by: CepInvalidoException
        //simulando um cep formatado
        return "23.765-064";
    }

}

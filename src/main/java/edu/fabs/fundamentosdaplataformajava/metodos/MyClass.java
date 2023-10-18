//package edu.fabs.fundamentosdaplataformajava.metodos;
//
//public class MyClass {
//
//    // PUBLIC -> visivel para todo o sistema
//    // PRIVATE -> metodo nao pode ser visto por outras classes no
//
//    public double somar(int num1, int num2) {
//        // LOGICA - FINALIDADE
//        return ...;
//    }
//
//    public void imprimir(String texto) {
//        // LOGICA - FINALIDADE
//        // NAO PRECISA DE RETURN, POIS NAO RETORNA RESULTADO
//    }
//
//    public double dividir(int dividendo, int divisor) throws Exception {}
//    // throws Exception: indica que ao utilizar o metodo podera gerar excecao caso um parametro seja zero
//
//    // PRIVATE -> metodo nao pode ser visto por outras classes no
//    private void metodoPrivado() {}
//
//    // EQUIVOCOS ESTRUTURAIS
//    public void validar() {
//        // se a finalidade e validar algo, o metodo deveria retornar um valor,
//        // no caso boolean, true or false
//
//    }
//
//    public void calcularEnviar() { // deve representar uma unica responsabilidade
//    }
//
//    public void gravarCliente(String nome, String cpf, Integer idade) { // deve representar uma unica responsabilidade
//        // este metodo tem a finalidade de gravar informacoes de um cliente,
//        // por que nao criar um objeto cliente e passar como parametro ?
//        // as vezes, muitos parametros podem ser a abstracao de um objeto
//    }
//
//    // exemplo
//    public void gravarClientes(Cliente cliente) {}
//    // OU
//    public void gravar(Cliente cliente){}
//
//}

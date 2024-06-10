public class Main {

    public static void main(String[] args) {
        PF Alvaro = new PF();
        PJ Joao = new PJ();

        Joao.criarCliente("Joao", "59.456.277/0001-76", "Brasil", 76, "Informatica");
        Alvaro.criarCliente("Alvaro", "141.013.976-00", "Brasil", 18, 'm');

        ContaUniversitaria contaA = new ContaUniversitaria();

        ContaCorrente contaJ = new ContaCorrente();

        contaJ.criarConta(4321, Joao, 0, 10000);
        contaA.criarConta(1234, Alvaro, 0, 10000);

        contaA.depositar(140);

        contaJ.depositar(100);

        contaA.sacar(100);

        contaJ.sacar(10);

        contaA.depositar(100);

        contaJ.depositar(8000);

        System.out.println(Alvaro.toString());

        contaA.imprimirExtrato();

        System.out.println(Joao.toString());

        contaJ.imprimirExtrato();

        if(Alvaro.equals(Alvaro)) System.out.println("Sao iguais");
            else System.out.println("Sao diferentes");

        if(contaA.equals(contaJ)) System.out.println("Sao iguais");
            else System.out.println("Sao diferentes");
    }
}

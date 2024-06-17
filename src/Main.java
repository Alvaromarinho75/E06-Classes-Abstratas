public class Main {

    public static void main(String[] args) {
        PF Alvaro = new PF();
        PJ Joao = new PJ();
        PJ Gabriel = new PJ();

        Joao.criarCliente("Joao", "59.456.277/0001-76", "Brasil", 76, "Informatica");
        Alvaro.criarCliente("Alvaro", "141.013.976-00", "Brasil", 18, 'm');
        Gabriel.criarCliente("Gabriel", "12.345.678/0001-76", "Brasil", 102, "Informatica");

        ContaUniversitaria contaA = new ContaUniversitaria();

        ContaCorrente contaJ = new ContaCorrente();

        ContaPoupanca contaG = new ContaPoupanca();

        contaJ.criarConta(4321, Joao, 0, 10000);
        contaA.criarConta(1234, Alvaro, 0, 100);
        contaG.criarConta(1221, Gabriel, 0, 500);

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

        System.out.println(Gabriel.toString());

        contaG.imprimirExtrato();
    }
}

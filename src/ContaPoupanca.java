public class ContaPoupanca extends Conta {

    public boolean setLimite(double limite){
        if(limite <= 1000 && limite >= 100) {
            this.limite = limite;
            return true;
        }
        return false;
    }
}
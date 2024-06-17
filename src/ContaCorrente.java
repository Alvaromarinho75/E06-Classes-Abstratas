public class ContaCorrente extends Conta {

    public boolean setLimite(double limite){
        if(limite >= -100) {
            this.limite = limite;
            return true;
        }
        return false;
    }
}

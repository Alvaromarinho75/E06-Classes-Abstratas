public class ContaUniversitaria extends Conta {


    public boolean setLimite(double limite){
        if(limite >= 0 && limite <= 500) {
            this.limite = limite;
            return true;
        }
        return false;
    }
}

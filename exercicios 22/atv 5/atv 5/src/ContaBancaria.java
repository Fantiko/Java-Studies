public class ContaBancaria {
    private double saldo; // Determina o saldo da conta.
    private double limite; // Determina o limite de crédito do cheque especial.

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoComLimite(){
        return this.saldo + this.limite;
    }

    public boolean sacar(double valor) throws ContaException {
       try {
           if (valor > getSaldoComLimite()) {
               throw new ContaException("falta de saldo e limite");
           }
           if (valor > 500) {
               throw new ContaException("saque muito alto");
           }

           this.saldo = this.saldo - valor;
           return true;

       }catch (ContaException e) {
           System.out.println(e.getMessage());
           return false;
       }
    }

    public void depositar(double valor) {
        try {

            if (valor > 1000){
                throw new ContaException(" deposito muito alto");
            }
            this.saldo = saldo + valor;
        }catch (ContaException e){
            System.out.println(e.getMessage());
        }
    }



}

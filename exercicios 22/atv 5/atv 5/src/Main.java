public class Main {
    public static void main(String[] args) throws ContaException {
        ContaBancaria a = new ContaBancaria( 1000 , 1000);
        System.out.println(a.getSaldo());
        System.out.println(a.getLimite());
        boolean b = a.sacar(100);
        System.out.println(b);
        System.out.println(a.getSaldo());
        System.out.println(a.getLimite());
        a.depositar(100);
        System.out.println(a.getSaldo());
        System.out.println(a.getLimite());





    }
}
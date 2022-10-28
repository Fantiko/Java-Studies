public class Main {
    public static void main(String[] args) {
        Contabanco p1 = new Contabanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        Contabanco p2 = new Contabanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.fecharConta();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um nome: ");
        String nome = teclado.nextLine();
        System.out.println("digite uma nota: ");
        float nota = teclado.nextFloat();
        System.out.println("o nome é:" + nome);
        System.out.println("a nota é:" + nota);


        String valor = Float.toString(nota);
    }
}
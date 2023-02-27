import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    private int divisor;
    private int dividendo;

    public Divisao() {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Digite o dividendo: ");
            this.dividendo = sc.nextInt();

            System.out.print("Digite o divisor: ");
            this.divisor = sc.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Erro: valor informado não é numérico.");
        }
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void dividir() {
        int resultado = 0;
        try {
            resultado = dividendo / divisor;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        }

    }

}



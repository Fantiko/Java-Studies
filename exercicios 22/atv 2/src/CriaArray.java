import  java.util.Scanner;
import java.util.InputMismatchException;

public class CriaArray {
    private final int[] array = new int[10];
    int cont = 0;

    public CriaArray(){
        Scanner sc = new Scanner(System.in);
        try{
            while (true){
                System.out.println("digite um numero: ");
                int num = sc.nextInt();
                if (num == 0){
                    array[this.cont] = num;
                    break;
                }
                array[this.cont] = num;
                this.cont++;
                if (this.cont > 9){
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERRO:limite de 10 valores passado");
        }catch (InputMismatchException e){
            System.out.println("ERRO: valor informado nao é numerico");
        }
    }

    public void printaVetor(){
        System.out.println("Valores do Vetor: ");
        for (int i = 0;i < cont ; i++ ){
            System.out.println(array[i] + " ");
        }


    }









}

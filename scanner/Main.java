import java.util.scanner;



public class Main  {

    public static void main(String[] args){

        Scanner meuScanner = new Scanner(System.in);
        System.out.println("digite o numero de instancias a criar:");
        int cont = meuScanner.nextInt();
        Pessoa[] meuarray = new Pessoa[cont];

        String tempNome;
        Int tempIdade;
        Pessoa tempPessoa;


        for (int i = 0;i < meuarray.length; i++ ) {
            System.out.println("digite o nome");
            String tempNome = meuScanner.next();

            System.out.println("digite a idade");
            int tempIdade = meuScanner.nextInt();

            tempPessoa = new Pessoa(tempNome, tempIdade);

            meuarray[i] = tempPessoa;
        }

        for (int i; i<meuarray.length;i++){
            System.out.println("pessoa " + i + "nome: "+ meuarray[i].getNome() + "idade: " + meuarray[i].getIdade());
        }
    }



}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /*-----pessoas-------*/
        Pessoa a = new Pessoa("fernando",22);
        Pessoa b = new Pessoa("Marcelinho", 37);
        Pessoa c = new Pessoa("Andre", 19);
        /*-------------------*/

        ArrayList<Pessoa> Lista_Pessoas = new ArrayList<>();
        Lista_Pessoas.add(a);
        Lista_Pessoas.add(b);
        Lista_Pessoas.add(c);
        /*-------por nome---*/
        ComparadorPessoaNome porNome= new ComparadorPessoaNome();
        Collections.sort(Lista_Pessoas,porNome);

        Iterator<Pessoa> it = Lista_Pessoas.iterator();

        while (it.hasNext()){
            System.out.println(it.next().getNome());
        }
        /*-------por idade---*/

        ComparadorPessoaIdade porIdade = new ComparadorPessoaIdade();
        Collections.sort(Lista_Pessoas,porIdade);

        it = Lista_Pessoas.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().getIdade());
        }
    }
}

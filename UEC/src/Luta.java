import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;



    public void marcarLuta(Lutador l1, Lutador l2){
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        int vencedor;
        if (isAprovada()){
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            vencedor = aleatorio.nextInt(3);
            System.out.println("========RESULTADO========");
            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empatou");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                }
                case 1 -> {
                    System.out.println(getDesafiado().getNome());
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                }
                case 2 -> {
                    System.out.println(getDesafiante().getNome());
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                }

            }
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolha(){
        System.out.println("glub glub");
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo anzol");
    }

    @Override
    public void emitirSom() {
        soltarBolha();
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

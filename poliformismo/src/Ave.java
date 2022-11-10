public class Ave extends Animal{
    private String corPena;
    public void fazerNinho(){

    }
    @Override
    public void locomover() {
        System.out.println("voar");
    }

    @Override
    public void alimentar() {
        System.out.println("comer");
    }

    @Override
    public void emitirSom() {
        System.out.println("som da ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}

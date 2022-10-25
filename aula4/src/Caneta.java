public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void  destampar(){
        tampada = false;
    }


    public void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO!! Nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }


    public void  status(){
        System.out.print("Uma caneta" +this.cor);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(("Modelo:" + this.modelo));
    }



}

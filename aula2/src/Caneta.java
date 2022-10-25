public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void  status(){
        System.out.print("Uma caneta" +this.cor);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(("Modelo:" + this.modelo));
    }
    public void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO!! Nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }

    public void tampar(){
        tampada = true;
    }

    public void  destampar(){
        tampada = false;
    }



}

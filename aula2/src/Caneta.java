public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void  status(){
        System.out.print("Uma caneta" +this.cor);
        System.out.println("Esta tampada?" + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(("Modelo:" + this.modelo));
    }
    void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO!! Nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }

    void tampar(){
        tampada = true;
    }

    void  destampar(){
        tampada = false;
    }



}

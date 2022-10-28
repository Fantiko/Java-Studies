import java.util.Objects;

public class Contabanco {
    public int numConta;
    protected String tipo;
    private String  dono;
    private float saldo;
    private boolean status;


    public  void Contabanco(){
        this.saldo = 0;
        status = false;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (Objects.equals(t, "CC")){
            saldo = 50;
        }
        if (Objects.equals(t, "CP")){
            saldo = 150;
        }
    }

    public void fecharConta(){
        if (saldo > 0){
            System.out.println("conta com dinheiro");
        } else if (saldo < 0){
            System.out.println("Conta em debito");
        }else {
            setStatus(false);
        }
    }

    public void depositar(float v){
        if (getStatus()){
            setSaldo(getSaldo() + v );
        }else {
            System.out.println("abra uma conta primeiro");
        }
    }

    public void sacar(float v){
        if (getStatus() && getSaldo() > v){
            setSaldo(getSaldo() - v);
        }else {
            System.out.println("sem dinheiro mano");
        }
    }

    public void pagarMensal(){
        float v = 0;
        if (Objects.equals(getTipo(),"CC")){
            v = 12;
        } else if (Objects.equals(getTipo(),"CP")) {
            v = 20;
        }
        if (getStatus()){
            setSaldo(getSaldo() - v);
        }
    }

    public void setNumConta(int i) {
        this.numConta = i;
    }
}

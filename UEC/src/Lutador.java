public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;

    //---------------//
    public Lutador(String no,  String na, int id, float al, float pe, int vi, int de, int em){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpate(em);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso()<52.2){
            this.categoria = "Invalido";
        } else if (getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9) {
            this.categoria = "medio";
        } else if (getPeso() <= 120.2) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "invalido";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    //---------------//

    public void apresentar(){
        System.out.println("Lutador:"  + getNome());
        System.out.println("Origem:" + getNacionalidade());
        System.out.println(getIdade() + "anos");
        System.out.println("Pensado:" + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu " + getDerrotas());
        System.out.println("Empatou " + getEmpate());
    }

    public void Status(){
        System.out.println(getNome());
        System.out.println("É um peso" + getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpate() + " Empates");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpate(getEmpate() + 1);
    }


}

public class Aluno extends Pessoa {
    private String login;
    private int totassistido;

    public Aluno(String nome, int idade, String sexo, float experiencia, String login) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totassistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() +
                "login='" + login + '\'' +
                ", totassistido=" + totassistido +
                '}';
    }
}

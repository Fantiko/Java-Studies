


public class Login {
    private String usuario; // Determina o nome do usuário
    private String senha; // Determina a senha do usuário.

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha){
        try {
            if (!usuario.equals(this.usuario)){
                throw new Exception("usuario incorreto");
            }
            if (!senha.equals(this.senha)){
                throw new Exception("senha incorreta");
            }

            System.out.println("login feito.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }









}

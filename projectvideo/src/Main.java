public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Chainsawman Full OP - 1 hour");
        v[2] = new Video("Rock Lee vs Gaara - Link Park");

        //System.out.println(v[2].toString());

        Aluno[] g = new Aluno[2];
        g[0] = new Aluno("fernando",33,"m",0,"aluno");
        g[1] = new Aluno("andre",43,"m",100,"andre");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());



    }
}
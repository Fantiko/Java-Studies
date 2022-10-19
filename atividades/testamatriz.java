public class testamatriz {
    public static void main(String[] args) {

        int linhas = 10;
        int colunas = 5;
        int[][] mat = new int[linhas][colunas];

        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }


        int[][] ed = new int[4][10];

        for (int i = 0; i < ed.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(ed[i][j] + " ");
            }
            System.out.println();
        }
    }
}

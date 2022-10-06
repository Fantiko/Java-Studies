public class Geometria{

    public static double calcularDistanciaPontos(double a, double b){

    double ax = a.getX();
    double ay = a.getY();

    double bx = b.getX();
    double by = b.getY();

    double d;

    d = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));

       return d;
    }

    public static double fatorial(double n){
        int aux = 1;
        int temp = n;
        while(temp > 1){
            aux*=temp;
            temp--;
            return aux;
        }
    }


}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> p = new  ArrayList<>();

        p.add(new Pessoa("mario"));
        p.add(new Pessoa("adenario"));
        p.add(new Pessoa("adanael"));

        for (Pessoa pe : p){
            System.out.println(pe);
        }
    }
}

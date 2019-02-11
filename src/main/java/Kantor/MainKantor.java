package Kantor;

public class MainKantor {

    public static void main(String[] args) {
        Kantor kantor=new Kantor();

        kantor.klientChceKupic("CHF", "USD", 1000.00);
        kantor.klientChceSprzedac("CHF", 1000.00,"USD");
    }
}

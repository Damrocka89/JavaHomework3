package NFZ;

import java.time.LocalDate;

public class MainNfz {

    public static void main(String[] args) {
        Ubezpieczyciel ubezpieczyciel=new Ubezpieczyciel();

        System.out.println(ubezpieczyciel.dodajOsobe(89042010543L, new Osoba("Ewelina", "Krasowska",
                LocalDate.of(1989, 04, 20))));
        System.out.println(ubezpieczyciel.dodajOsobe(89042010543L, new Osoba("Ewelina", "Krasowska",
                LocalDate.of(1989, 04, 20))));
        System.out.println(ubezpieczyciel.znajdzOsobe(89042010543L));
        System.out.println(ubezpieczyciel.aktualizujOsobe(89042010543L, new Osoba("Ewelina", "Łodyńska",
                LocalDate.of(1989, 04, 20))));
        System.out.println(ubezpieczyciel.aktualizujOsobe(89052010543L, new Osoba("Ewelina", "Łodyńska",
                LocalDate.of(1989, 04, 20))));
        System.out.println(ubezpieczyciel.znajdzOsobe(89042010543L));
    }
}

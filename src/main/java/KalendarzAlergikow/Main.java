package KalendarzAlergikow;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        KalendarzAlergikow kalendarzAlergikow=new KalendarzAlergikow();

        kalendarzAlergikow.wyswietlDatyPylenia("żyto");
        kalendarzAlergikow.coPyliDanegoDnia(LocalDate.of(2019,8,15));


    }
}

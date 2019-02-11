package NFZ;

import java.util.HashMap;
import java.util.Map;

public class Ubezpieczyciel {

    private long pesel;
    private Map<Long, Osoba> ubezpieczony;

    public Ubezpieczyciel() {
        this.ubezpieczony = new HashMap<>();
    }

    public boolean dodajOsobe(long pesel, Osoba osoba){
        for (Map.Entry<Long, Osoba> entry : ubezpieczony.entrySet()) {
            if (osoba.equals(entry.getValue())){
                return false;
            }
        }
        ubezpieczony.put(pesel,osoba);
        return true;
    }

    public Osoba znajdzOsobe(long pesel){
        return ubezpieczony.get(pesel);
    }
    
    public boolean aktualizujOsobe(long pesel, Osoba noweDane){
        for (Long key : ubezpieczony.keySet()) {
            if (pesel!=key){
                return false;
            }
        }
        ubezpieczony.replace(pesel, noweDane);
        return true;
    }
}

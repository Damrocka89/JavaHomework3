package KalendarzAlergikow;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class KalendarzAlergikow {

    private String żyto;
    private String wierzba;
    private String bylica;

    private Map<String, ZakresDat> kalendarz;

    public KalendarzAlergikow() {
        this.kalendarz = new HashMap<String, ZakresDat>();
        kalendarz.put("żyto", new ZakresDat(LocalDate.of(2019,5,31),LocalDate.of(2019,6,15)));
        kalendarz.put("wierzba", new ZakresDat(LocalDate.of(2019,3,1),LocalDate.of(2019,5,15)));
        kalendarz.put("bylica", new ZakresDat(LocalDate.of(2019,7,1),LocalDate.of(2019,9,30)));
    }



    public void wyswietlDatyPylenia(String alergen){
        System.out.println(alergen+" - okres pylenia: "+kalendarz.get(alergen));
    }

    public void coPyliDanegoDnia(LocalDate data){
        for (Map.Entry<String, ZakresDat> element: kalendarz.entrySet()) {
            if (data.isAfter(element.getValue().getDataOd()) && data.isBefore(element.getValue().getDataDo()) ||
                    data.isEqual(element.getValue().getDataDo()) || data.isEqual(element.getValue().getDataOd())){
                System.out.println(data+ " - pyli: "+element.getKey());

            }
        }
    }
}

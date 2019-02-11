package KalendarzAlergikow;

import java.time.LocalDate;

public class ZakresDat {

    private LocalDate dataOd;
    private LocalDate dataDo;

    public ZakresDat(LocalDate dataOd, LocalDate dataDo) {
        this.dataOd = dataOd;
        this.dataDo = dataDo;
    }

    @Override
    public String toString() {
        return "od " + dataOd +
                ", do " + dataDo;
    }

    public LocalDate getDataOd() {
        return dataOd;
    }

    public LocalDate getDataDo() {
        return dataDo;
    }
}

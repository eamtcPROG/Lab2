import java.time.LocalDate;

public class InventarPaza {
    private int nrInvantar;
    private String denumire;
    private LocalDate dataInstalare;

    private LocalDate dataDemontare;

    public int getNrInvantar() {
        return this.nrInvantar;
    }

    public void setNrInvantar(int nrInvantar) {
        this.nrInvantar = nrInvantar;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public LocalDate getDataInstalare() {
        return this.dataInstalare;
    }

    public void setDataInstalare(LocalDate dataInstalare) {
        this.dataInstalare = dataInstalare;
    }

    public LocalDate getDataDemontare() {
        return dataDemontare;
    }

    public void setDataDemontare(LocalDate dataDemontare) {
        this.dataDemontare = dataDemontare;
    }

    public InventarPaza(int nrInvantar, String denumire, LocalDate dataInstalare, LocalDate dataDemontare) {
        this.nrInvantar = nrInvantar;
        this.denumire = denumire;
        this.dataInstalare = dataInstalare;
        this.dataDemontare = dataDemontare;
    }
}

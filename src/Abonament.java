import java.time.LocalDate;

public class Abonament {
    private int code;
    private String denumire;
    private LocalDate inceput;
    private LocalDate sfarsit;
    private boolean activ;

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public LocalDate getInceput() {
        return this.inceput;
    }

    public void setInceput(LocalDate inceput) {
        this.inceput = inceput;
    }

    public LocalDate getSfarsit() {
        return this.sfarsit;
    }

    public void setSfarsit(LocalDate sfarsit) {
        this.sfarsit = sfarsit;
    }

    public boolean isActiv() {
        return this.activ;
    }

    public void setActiv(boolean activ) {
        this.activ = activ;
    }

    public Abonament(int code, String denumire, LocalDate inceput, LocalDate sfarsit, boolean activ) {
        this.code = code;
        this.denumire = denumire;
        this.inceput = inceput;
        this.sfarsit = sfarsit;
        this.activ = activ;
    }
}

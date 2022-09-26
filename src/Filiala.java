public class Filiala {
    private String denumire;
    private int tipStrada;
    private int tipAngajat;
    private int tipClient;
    private int tipInvetarPaza;
    private int tipInvetarSportiv;
    private int tipInvetarCuratenie;

    public String getDenumire() {
        return this.denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getTipStrada() {
        return this.tipStrada;
    }

    public void setTipStrada(int tipStrada) {
        this.tipStrada = tipStrada;
    }

    public int getTipAngajat() {
        return this.tipAngajat;
    }

    public void setTipAngajat(int tipAngajat) {
        this.tipAngajat = tipAngajat;
    }

    public int getTipClient() {
        return this.tipClient;
    }

    public void setTipClient(int tipClient) {
        this.tipClient = tipClient;
    }

    public int getTipInvetarPaza() {
        return this.tipInvetarPaza;
    }

    public void setTipInvetarPaza(int tipInvetarPaza) {
        this.tipInvetarPaza = tipInvetarPaza;
    }

    public int getTipInvetarSportiv() {
        return this.tipInvetarSportiv;
    }

    public void setTipInvetarSportiv(int tipInvetarSportiv) {
        this.tipInvetarSportiv = tipInvetarSportiv;
    }

    public int getTipInvetarCuratenie() {
        return this.tipInvetarCuratenie;
    }

    public void setTipInvetarCuratenie(int tipInvetarCuratenie) {
        this.tipInvetarCuratenie = tipInvetarCuratenie;
    }

    public Filiala(String denumire, int tipStrada, int tipAngajat, int tipClient, int tipInvetarPaza, int tipInvetarSportiv, int tipInvetarCuratenie) {
        this.denumire = denumire;
        this.tipStrada = tipStrada;
        this.tipAngajat = tipAngajat;
        this.tipClient = tipClient;
        this.tipInvetarPaza = tipInvetarPaza;
        this.tipInvetarSportiv = tipInvetarSportiv;
        this.tipInvetarCuratenie = tipInvetarCuratenie;
    }
}

public class Strada {
    private String denumire;
    private int numar;
    private int scara;
    private int localiate;

    public String getDenumire() {
        return this.denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNumar() {
        return this.numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public int getScara() {
        return this.scara;
    }

    public void setScara(int scara) {
        this.scara = scara;
    }

    public int getLocaliate() {
        return this.localiate;
    }

    public void setLocaliate(int localiate) {
        this.localiate = localiate;
    }

    public Strada(String denumire, int numar, int scara, int localiate) {
        this.denumire = denumire;
        this.numar = numar;
        this.scara = scara;
        this.localiate = localiate;
    }
}

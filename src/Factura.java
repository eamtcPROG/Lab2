public class Factura {
    private String nume;
    private String prenume;
    private String idnp;
    private int tipAbonament;
    private double pret;

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getIdnp() {
        return this.idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public int getTipAbonament() {
        return this.tipAbonament;
    }

    public void setTipAbonament(int tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public double getPret() {
        return this.pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Factura(String nume, String prenume, String idnp, int tipAbonament, double pret) {
        this.nume = nume;
        this.prenume = prenume;
        this.idnp = idnp;
        this.tipAbonament = tipAbonament;
        this.pret = pret;
    }
}

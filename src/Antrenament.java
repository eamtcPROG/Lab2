public class Antrenament {
    private String tipAntrenament;
    private String antrenor;
    private int numarAntrenamente;

    public String getTipAntrenament() {
        return this.tipAntrenament;
    }

    public void setTipAntrenament(String tipAntrenament) {
        this.tipAntrenament = tipAntrenament;
    }

    public String getAntrenor() {
        return this.antrenor;
    }

    public void setAntrenor(String antrenor) {
        this.antrenor = antrenor;
    }

    public int getNumarAntrenamente() {
        return this.numarAntrenamente;
    }

    public void setNumarAntrenamente(int numarAntrenamente) {
        this.numarAntrenamente = numarAntrenamente;
    }

    public Antrenament(String tipAntrenament, String antrenor, int numarAntrenamente) {
        this.tipAntrenament = tipAntrenament;
        this.antrenor = antrenor;
        this.numarAntrenamente = numarAntrenamente;
    }
}

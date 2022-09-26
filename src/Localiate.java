public class Localiate {
    private String denumire;
    private int raion;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getRaion() {
        return raion;
    }

    public void setRaion(int raion) {
        this.raion = raion;
    }

    public Localiate(String denumire, int raion) {
        this.denumire = denumire;
        this.raion = raion;
    }
}

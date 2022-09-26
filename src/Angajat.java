import java.time.LocalDate;

public class Angajat {
    private String nume;
    private String prenume;
    private int varsta;
    private String idnp;
    private double salariu;
    private String functie;
    private String codDeAcces;
    private LocalDate dataAngajare;
    private LocalDate dataConcediere;

    private String username;

    private String password;

    public void setNume(String pNume){
        this.nume = pNume;
    }

    public void setPrenume(String pNume){
        this.prenume = pNume;
    }

    public void setIdnp(String pN){
        this.idnp = pN;
    }

    public void setSalariu(double pV){
        this.salariu = pV;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public void setCodDeAcces(String codDeAcces) {
        this.codDeAcces = codDeAcces;
    }

    public String getNume(){
        return this.nume;
    }

    public String getPrenume(){
        return this.prenume;
    }

    public String getIdnp(){
        return this.idnp;
    }

    public double getSalariu(){
        return this.salariu;
    }

    public String getFunctie() {
        return this.functie;
    }

    public String getCodDeAcces() {
        return this.codDeAcces;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public LocalDate getDataAngajare() {
        return this.dataAngajare;
    }

    public void setDataAngajare(LocalDate dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public LocalDate getDataConcediere() {
        return this.dataConcediere;
    }

    public void setDataConcediere(LocalDate dataConcediere) {
        this.dataConcediere = dataConcediere;
    }
    public int getVarsta() {
        return this.varsta;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Angajat(String nume, String prenume, int varsta, String idnp, double salariu, String functie, String codDeAcces, LocalDate dataAngajare, LocalDate dataConcediere, String username, String password) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.idnp = idnp;
        this.salariu = salariu;
        this.functie = functie;
        this.codDeAcces = codDeAcces;
        this.dataAngajare = dataAngajare;
        this.dataConcediere = dataConcediere;
        this.username = username;
        this.password = password;
    }
}

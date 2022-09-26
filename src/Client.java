import java.time.LocalDate;

public class Client {
    private String nume;
    private String prenume;
    private int varsta;
    private String idnp;
    private String codDeAcces;
    private String tipAbonament;
    private LocalDate dataCreareAbonament;
    private LocalDate dataDeExpirareAbonamet;

    public void setNume(String pNume){
        this.nume = pNume;
    }

    public void setPrenume(String pNume){
        this.prenume = pNume;
    }

    public void setIdnp(String pN){
        this.idnp = pN;
    }

    public void setPrenume(int pV){
        this.varsta = pV;
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

    public int getVarsta(){
        return this.varsta;
    }

    public String getCodDeAcces() {
        return this.codDeAcces;
    }

    public LocalDate getDataDeExpirareAbonamet() {
        return this.dataDeExpirareAbonamet;
    }

    public void setDataDeExpirareAbonamet(LocalDate dataDeExpirareAbonamet) {
        this.dataDeExpirareAbonamet = dataDeExpirareAbonamet;
    }

    public String getTipAbonament() {
        return this.tipAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public LocalDate getDataCreareAbonament() {
        return this.dataCreareAbonament;
    }

    public void setDataCreareAbonament(LocalDate dataCreareAbonament) {
        this.dataCreareAbonament = dataCreareAbonament;
    }

    public Client(String nume, String prenume, int varsta, String idnp, String codDeAcces, String tipAbonament, LocalDate dataCreareAbonament, LocalDate dataDeExpirareAbonamet) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.idnp = idnp;
        this.codDeAcces = codDeAcces;
        this.tipAbonament = tipAbonament;
        this.dataCreareAbonament = dataCreareAbonament;
        this.dataDeExpirareAbonamet = dataDeExpirareAbonamet;
    }
}

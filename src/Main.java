import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sala sportiva!");
        Abonament abonament = new Abonament(111,"Standart", LocalDate.parse("2022-12-03"),LocalDate.parse("2023-12-03"),true);
        System.out.println(abonament.getCode());
        Angajat angajat = new Angajat("Coretchi","Mihai",20,"12323443532",2000,"Antrenor","1234",LocalDate.parse("2022-12-03"),null,"admin","admin");
        System.out.println(angajat.getSalariu());
        Antrenament antrenament = new Antrenament("Personal","Stropsa",10);
        System.out.println(antrenament.getTipAntrenament());
        Client client = new Client("Test","test",12,"1232143124","324","1",LocalDate.parse("2022-12-03"),LocalDate.parse("2023-12-03"));
        System.out.println(client.getIdnp());
        Factura factura = new Factura("Aleee","tess","21324",1,2000);
        System.out.println(factura.getPret());
        Filiala filiala = new Filiala("Filiala 1",1,1,1,1,1,1);
        System.out.println(filiala.getDenumire());
        InvenarPentruCuratenie invenarPentruCuratenie = new InvenarPentruCuratenie(1,"test",LocalDate.parse("2022-12-03"),null);
        System.out.println(invenarPentruCuratenie.getNrInvantar());
        InventarPaza inventarPaza = new InventarPaza(1,"Camera",LocalDate.parse("2022-12-03"),null);
        System.out.println(inventarPaza.getDataInstalare());
        InvetarSportiv invetarSportiv = new InvetarSportiv(1,"aparat",null,null);
        System.out.println(invetarSportiv.getDenumire());
        Localiate localiate = new Localiate("Chisinau",1);
        System.out.println(localiate.getDenumire());
        Promotie promotie = new Promotie("Special",2.5);
        System.out.println(promotie.getPromotie());
        Raion raion = new Raion("mun Chisinau");
        System.out.println(raion.getDenumire());
        Strada strada = new Strada("Studentilor",12,1,1);
        System.out.println(strada.getNumar());
    }

}
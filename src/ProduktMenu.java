import java.util.Objects;

public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;

    private static int liczbaProduktów = 0;



    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;

        liczbaProduktów++;
    }

    public String getKod() {
        return kod;
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena() {
        return cena;
    }
    public String getKategoria() {
        return kategoria;
    }

    public static int getLiczbaProduktów() {
        return liczbaProduktów;
    }

    @Override
    public String toString() {
        return  getKod() + " " + getNazwa() + " " + getCena() + " " + getKategoria();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProduktMenu that)) return false;
        return Objects.equals(kod, that.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kod);
    }
}

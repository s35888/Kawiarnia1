import java.util.Objects;

public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;


    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getPelneDane() {
        return imie + " " + nazwisko + " " + email + " " + idKlienta;
    }

    @Override
    public String toString() {
        return getPelneDane();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof KlientKawiarni that)) return false;
        return idKlienta == that.idKlienta && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKlienta, email);
    }
}

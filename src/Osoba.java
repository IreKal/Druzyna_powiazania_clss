import java.util.Objects;

public class Osoba {

    String imie;
    String nazwisko;
    int wiek;
    String Specjalizacja;

    public Osoba(String imie, String nazwisko, int wiek, String specjalizacja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        Specjalizacja = specjalizacja;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getSpecjalizacja() {
        return Specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        Specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", Specjalizacja='" + Specjalizacja + '\'' +
                '}';
    }
}

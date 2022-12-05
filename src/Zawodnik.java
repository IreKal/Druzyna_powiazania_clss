public class Zawodnik extends Osoba{

    int numer_koszulki;

    public Zawodnik(String imie, String nazwisko, int wiek, String specjalizacja, int numer_koszulki) {
        super(imie, nazwisko, wiek, specjalizacja);
        this.numer_koszulki = numer_koszulki;
    }

    public int getNumer_koszulki() {
        return numer_koszulki;
    }

    public void setNumer_koszulki(int numer_koszulki) {
        this.numer_koszulki = numer_koszulki;
    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "numer_koszulki=" + numer_koszulki +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", Specjalizacja='" + Specjalizacja + '\'' +
                '}';
    }
}

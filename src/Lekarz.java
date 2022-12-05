public class Lekarz extends  Osoba {

    public Lekarz(String imie, String nazwisko, int wiek, String specjalizacja) {
        super(imie, nazwisko, wiek, specjalizacja);
    }


    @Override
    public String toString() {
        return "Lekarz{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", Specjalizacja='" + Specjalizacja + '\'' +
                '}';
    }
}

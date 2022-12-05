public class Psycholog extends Osoba {

    public Psycholog(String imie, String nazwisko, int wiek, String specjalizacja) {
        super(imie, nazwisko, wiek, specjalizacja);
    }

    @Override
    public String toString() {
        return "Psycholog{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", Specjalizacja='" + Specjalizacja + '\'' +
                '}';
    }
}

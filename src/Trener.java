public class Trener extends  Osoba{

    int staz;

    public Trener(String imie, String nazwisko, int wiek, String specjalizacja, int staz) {
        super(imie, nazwisko, wiek, specjalizacja);
        this.staz = staz;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    @Override
    public String toString() {
        return "Trener{" +
                "staz=" + staz +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", Specjalizacja='" + Specjalizacja + '\'' +
                '}';
    }
}

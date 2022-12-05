public class Pozycja_1 {

    String Obronca;
    String Pomocnik;
    String Napastnik;
    String Bramkarz;

    public Pozycja_1(String obronca, String pomocnik, String napastnik, String bramkarz) {
        Obronca = obronca;
        Pomocnik = pomocnik;
        Napastnik = napastnik;
        Bramkarz = bramkarz;
    }

    public String getObronca() {
        return Obronca;
    }

    public void setObronca(String obronca) {
        Obronca = obronca;
    }

    public String getPomocnik() {
        return Pomocnik;
    }

    public void setPomocnik(String pomocnik) {
        Pomocnik = pomocnik;
    }

    public String getNapastnik() {
        return Napastnik;
    }

    public void setNapastnik(String napastnik) {
        Napastnik = napastnik;
    }

    public String getBramkarz() {
        return Bramkarz;
    }

    public void setBramkarz(String bramkarz) {
        Bramkarz = bramkarz;
    }

    @Override
    public String toString() {
        return "Pozycja{" +
                "Obronca='" + Obronca + '\'' +
                ", Pomocnik='" + Pomocnik + '\'' +
                ", Napastnik='" + Napastnik + '\'' +
                ", Bramkarz='" + Bramkarz + '\'' +
                '}';
    }
}








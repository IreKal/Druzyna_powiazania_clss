public class Druzyna {
    String nazwa;
    String stadion;
    String herb;

    public Druzyna(String nazwa, String stadion, String herb) {
        this.nazwa = nazwa;
        this.stadion = stadion;
        this.herb = herb;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getStadion() {
        return stadion;
    }

    public void setStadion(String stadion) {
        this.stadion = stadion;
    }

    public String getHerb() {
        return herb;
    }

    public void setHerb(String herb) {
        this.herb = herb;
    }

    @Override
    public String toString() {
        return "Druzyna{" +
                "nazwa='" + nazwa + '\'' +
                ", stadion='" + stadion + '\'' +
                ", herb='" + herb + '\'' +
                '}';
    }
}

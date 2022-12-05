public class Sezon {

    String terminarz;
    int ilosc_druzyn;
    int ilosc_meczy;
    int punkty;

    public Sezon(String terminarz, int ilosc_druzyn, int ilosc_meczy, int punkty) {
        this.terminarz = terminarz;
        this.ilosc_druzyn = ilosc_druzyn;
        this.ilosc_meczy = ilosc_meczy;
        this.punkty = punkty;
    }

    public String getTerminarz() {
        return terminarz;
    }

    public void setTerminarz(String terminarz) {
        this.terminarz = terminarz;
    }

    public int getIlosc_druzyn() {
        return ilosc_druzyn;
    }

    public void setIlosc_druzyn(int ilosc_druzyn) {
        this.ilosc_druzyn = ilosc_druzyn;
    }

    public int getIlosc_meczy() {
        return ilosc_meczy;
    }

    public void setIlosc_meczy(int ilosc_meczy) {
        this.ilosc_meczy = ilosc_meczy;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    @Override
    public String toString() {
        return "Sezon{" +
                "terminarz='" + terminarz + '\'' +
                ", ilosc_druzyn=" + ilosc_druzyn +
                ", ilosc_meczy=" + ilosc_meczy +
                ", punkty=" + punkty +
                '}';
    }
}

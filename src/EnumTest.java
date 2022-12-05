
public class EnumTest {
    Pozycja pozycja;

    public EnumTest(Pozycja pozycja) {
        this.pozycja = pozycja;
    }

    public void who() {
        switch (pozycja) {
            case OBRONCA:
                System.out.println("Zawodnik jest obronca");
                break;
            case NAPASTNIK:
                System.out.println("Zawodnik jest napasynikiem");
                break;
            default:
                System.out.println("Nie wiadomo kto");
                break;
        }
    }}
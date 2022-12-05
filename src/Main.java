public class Main {
    public static void main(String[] args) {

        Trener Trener = new Trener("Stach","Krol",43,"bieg",5);
        System.out.println(Trener.toString());

        Lekarz Lekarz = new Lekarz("Jan","Kowalski",33,"ortopeda");
        System.out.println(Lekarz.toString());

        Psycholog Psycholog = new Psycholog("Misio","Krolik",35,"walka");
        System.out.println(Psycholog.toString());

        Zawodnik  Zawodnik = new Zawodnik("Krzysiek","Krzysiek",18,
                "obrona",21);
        System.out.println(Zawodnik.toString());

        Sezon Sezon = new Sezon("12.12",43,23,12);
        System.out.println(Sezon.toString());

        Mecz Mecz = new Mecz("45","Kielce",1,"6","0","2");
        System.out.println(Mecz.toString());

        Pozycja_1   Pozycja_1 = new Pozycja_1("czesiek","mietek",
                "marek","antek");
        System.out.println(Pozycja_1.toString());

        EnumTest e =  new EnumTest(Pozycja.NAPASTNIK);
        e.who();


    }
}
public class Uczen extends Osoba implements Dyzurny{
//dziedziczenie dzidziczymy wszystko publiczne i chronione
    private int nrEwidencyjny;
    public static int liczbauczniow;

    public Uczen(String imie, String nazwisko){
        super(imie, nazwisko);
        liczbauczniow++;
        nrEwidencyjny = liczbauczniow;
    }

    @Override
    public String toString() {
        return "Uczen: " +
                "imie: "+getImie()+
                " nazwisko: "+getNazwisko()+
                " nrEwidencyjny=" + nrEwidencyjny;
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Sćieram tablicę");
    }
}

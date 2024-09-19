import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jaś", "Stokrotka");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());
        osoba.setImie("Jan");
        System.out.println(osoba.getWiek());
        System.out.println(osoba);//wywolywana metoda toString


        System.out.println("Liczba uczniow: "+Uczen.liczbauczniow);
        Uczen uczen = new Uczen("Ewa", "Mewa");
        System.out.println(uczen);
        System.out.println("Liczba uczniow: "+Uczen.liczbauczniow);
        Uczen uczen1 = new Uczen("Ada", "Pada");
        System.out.println(uczen1);
        System.out.println("Liczba uczniow: "+Uczen.liczbauczniow);
        Uczen uczen2 = new Uczen("Staś", "Paś");
        System.out.println(uczen2);
        System.out.println("Liczba uczniow: "+Uczen.liczbauczniow);
    }
}
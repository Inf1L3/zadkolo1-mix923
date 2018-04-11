package pl.edu.ur.kolo1;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
        
        Zad1 zad1=new Zad1();
        zad1.zadanie();
        
        
        Zad2 zad2=new Zad2();
        zad2.zadanie(10);
        
        
        Zadanie3 zadanie =new Zadanie3();
        zadanie.Wprowadzanie();
        zadanie.Wyswietl();
        zadanie.Srednia();
        
        
        Osoba osoba =new Osoba("Mateusz","Molik",18,70,180);
        osoba.Wyswietl();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;

/**
 *
 * @author student
 */
public class Osoba {
    
    private String imie;
    private String nazwisko;
    private int  wiek;
    private int  waga;
    private int  wzrost;

    public Osoba(String imie, String nazwisko, int wiek, int waga, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
    }

    public Osoba(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }
    
    public void Wyswietl()
    {
        System.out.println("Imie " + this.imie+" Nazwisko "+ this.nazwisko +" wiek" + this.wiek +" waga" + this.waga +" wzrost" + this.wzrost);
    }
    
    
}

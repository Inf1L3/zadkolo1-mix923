/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zadanie3 {
    private int[] tablica =new int[10];

    public Zadanie3() {
    }
    
    public void Wprowadzanie()
    {
       Scanner odczyt = new Scanner(System.in);
       for(int i=0;i<10;i++)
       {
          System.out.println("Podaj liczbe do tablicy:");
          tablica[i]=odczyt.nextInt();
       }
    }
    
    public void Wyswietl()
    {
      for(int tmp : tablica)
      {
           System.out.println(" "+ tmp);
      }
    }
    
    public float Srednia()
    {
        float srednia =0;
        for(int tmp : tablica)
        {
          srednia+=tmp;
        }
        return (srednia/10);
    }
}

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
public class Zad1 {

    public Zad1() {
    }
    
    public void zadanie()
    {
      for(int i=10;i>=0;i++)
      {
        if(i==8||i==6||i==3||i==1)
        {
          continue;
        }
        System.out.println(""+i);
      }
    }
    
}

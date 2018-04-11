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
public class Zad2 {

    public Zad2() {
    }
    
    public void zadanie(int wyraz)
    {
       System.out.println(""+fib(wyraz));
    }
    
    public  int fib(int n){
    if ((n==1)||(n==2))
    return 1;
    else
    return fib(n-1)+fib(n-2);
    } 
}

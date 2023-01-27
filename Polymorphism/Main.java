/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author RIMTECH COMPUTER
 */

public class Main {
    
    public static void main(String[] args) 
    {
        BangunDatar bd = new BangunDatar();
        Persegi p = new Persegi(5);
        Lingkaran ling = new Lingkaran(7);
       
        //memanggil method luas dan keliling
        bd.luas();
        bd.keliling();
       
        System.out.println("Luas Persegi = "+p.luas());
        System.out.println("Keliling Persegi = "+p.keliling());
        System.out.println("Luas Lingkaran = "+ling.luas());
        System.out.println("Keliling Lingkaran = "+ling.keliling());
        
   
        
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmi081222;

/**
 *
 * @author RIMTECH COMPUTER
 */
public class Aritmatika {
    public int tambah(int a, int b)
    {
      
        return a+b;
    }
    
    public static int kurang(int a, int b)
    {
      
        return a-b;
    }
    
    public static void main(String [] args)
    {
        Aritmatika aritmatika = new Aritmatika();  //instance
        int a = 5;
        int b = 3;
        int hasiltambah = aritmatika.tambah(a, b);
        int hasilkurang = aritmatika.kurang(a, b);
        
        System.out.println(hasiltambah);
        System.out.println(hasilkurang);
    }
    
    
    
}

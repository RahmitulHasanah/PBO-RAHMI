/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmi190922;

/**
 *
 * @author RIMTECH COMPUTER
 */
public class Latihan12 
{
    public static void main( String[] args )
    {
        int x = 10;
        int y = 23;
        int z = 5;
        int max;
        
        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);
        
        //mencari nilai tertinggi
        /*
        if (x>y && x>z) {
            max = x;
        } else if (y>x && y>z){
            max = y;
        } else{
            max = x;
        }
        
        System.out.println("Nilai tertingginya adalah = "+max);

        */
        
        max=(y>=x)? y: x;
        max=(z>=max)? z: max;
        
        System.out.println("Nilai tertingginya adalah = "+max);
        
    }
    
}

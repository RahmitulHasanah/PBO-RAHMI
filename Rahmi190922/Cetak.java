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

    public class Cetak {
 
    // Method sama namun parameter berbeda 
    // Tipe data double
    static double maxNumber(double a, double b) {
        if (a < b) {
            return a;
        }else{
            return b;
        }   
    }
 
    // Method sama, namun parameter berbeda
    // Tipe data int
    static int maxNumber(int a, int b) {   
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
 
    public static void main(String[] argrs) {
        System.out.println(maxNumber(5.5, 7.5));
        System.out.println(maxNumber(10, 20));
    }
 
}
    

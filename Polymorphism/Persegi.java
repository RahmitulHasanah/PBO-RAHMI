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

public class Persegi extends BangunDatar{
    int sisi;
 
    public Persegi(int sisi) { //Constructor
        this.sisi = sisi;
    }
   
    @Override
    float luas(){
        return this.sisi * this.sisi;
    }
   
    @Override
    float keliling(){
        return this.sisi * 4;
    }
}

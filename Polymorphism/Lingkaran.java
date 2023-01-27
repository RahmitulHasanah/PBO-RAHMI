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

public class Lingkaran extends BangunDatar{
    int r;
 
    public Lingkaran(int r) {
        this.r = r;
    }
 
    @Override
    float luas(){
        return(float)(Math.PI*Math.pow(r,2));
    }
       
    @Override
    float keliling(){
        return(float)(2*Math.PI*r);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_RahmitulHasanah;

/**
 *
 * @author RIMTECH COMPUTER
 */
public class Student extends Person{
    
    public Student(){
        super("Anna","Padang");
        System.out.println("Inside Student : Constructor");
    }
    
    @Override
    public String getName(){ 
        System.out.println("getName Student");
        return name; 
    } 
    
    public String getAddress(){ 
        System.out.println("getName Student");
        return name; 
    } 
    
    public void setNobp(String nobp){ 
        this.nobp = nobp; 
    } 
    
    public static void main(String[] args) {
        Student anna = new Student();
        anna.name = "Putri";
        anna.address = "Padang";
        anna.nobp = "2101092014";
        
        System.out.println(anna.name);
        System.out.println(anna.address);
        System.out.println(anna.nobp);
        
    }
    
}

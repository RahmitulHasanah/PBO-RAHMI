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

abstract class MI 
{
 
    // Mendeklrasikan class dan method tipe abstract 
    protected abstract void memberGroup();
 
}
 
class TK extends MI 
{
    
    // Menggunakan method dari kelas induk abstrak
    @Override
    protected void memberGroup() 
    {
        System.out.println("Manajemen Informatika : MIA, MIB, MIC");
    }
 
}
 
class Talent extends MI 
{
 
    // Menggunakan method dari kelas induk abstrak
    @Override
    protected void memberGroup() 
    {
        System.out.println("Teknologi Komputer  : TKA, TKB");
    }
 
}
 
public class Tampil 
{
 
    public static void main (String[] args) 
    {
        MI TK = new TK();
        TK.memberGroup();
    
        MI Talent = new Talent();
        Talent.memberGroup();
    }
   
 
}


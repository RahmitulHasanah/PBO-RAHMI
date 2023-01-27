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
public class Rahmitul {
    public void Elhasanah() 
  {
    for (int i = 1; i < 10; i++) 
    {
      System.out.print(i);
    }
  }

  
  public void  Elhasanah(char ss) 
  {
    for (int j = 1; j > 10; j--) 
    {
      System.out.print(ss);
    }
  }
  
}

class Mainn 
{
  public static void main(String[] args) 
  {
    Rahmitul p1 = new Rahmitul();

    // call method without any argument
    p1.Elhasanah();
    System.out.println("\n");

    // call method with a single argument
    p1.Elhasanah('j');
  }
}

  



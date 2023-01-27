/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmi15122022;

/**
 *
 * @author RIMTECH COMPUTER
 */

public class StudentRecordExample 
{
    public static void main( String[] args ) 
    { 
        StudentRecord annaRecord = new StudentRecord(); 
        StudentRecord aliRecord = new StudentRecord(); 
        
        annaRecord.setName("Anna"); 
        annaRecord.setAddress("Philippines"); 
        annaRecord.setAge(15); 
        annaRecord.setMathGrade(80); 
        annaRecord.setEnglishGrade(95.5); 
        annaRecord.setScienceGrade(100);
        
        System.out.println("Nama            : "+annarecord.getName());
        System.out.println("Alamat          : "+annarecord.getAddress());
        System.out.println("Umur            : "+annarecord.getAge());
        System.out.println("Matematika      : "+annarecord.getMathGrade());
        System.out.println("English         : "+annarecord.getEnglishGrade());
        System.out.println("Science         : "+annarecord.getScienceGrade());
        System.out.println("Rata            : "+annarecord.getAverage());
        
        aliRecord.print("");
        aliRecord.print(90,80,70);
        
        System.out.println("Jumlah Siswa    : "+StudentRecord.getStudentCount());
    }
}


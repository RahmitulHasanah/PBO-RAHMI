/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_RahmitulHasanah;

import java.awt.Color; 
import java.awt.*; 
/**
 *
 * @author RIMTECH COMPUTER
 */
public class StudentRecordExample {
public static void main(String[] args) {
        StudentRecord annarecord = new StudentRecord();
        StudentRecord putrirecord = new StudentRecord();
          
        annarecord.setName("Anna");
        annarecord.setAddress("Padang");
        annarecord.setAge(22);
        annarecord.setMathGrade(85);
        annarecord.setEnglishGrade(90);
        annarecord.setScienceGrade(80);
        
        putrirecord.setName("Putri");
        putrirecord.setAddress("Bukittinggi");
        putrirecord.setAge(19);
        
        System.out.println("Nama            : "+annarecord.getName());
        System.out.println("Alamat          : "+annarecord.getAddress());
        System.out.println("Umur            : "+annarecord.getAge());
        System.out.println("Matematika      : "+annarecord.getMathGrade());
        System.out.println("B.inggris       : "+annarecord.getEnglishGrade());
        System.out.println("Pengetahuan     : "+annarecord.getScienceGrade());
        System.out.println("Rata - Rata     : "+annarecord.getAverage());
        
        System.out.println("\n");
        putrirecord.print("");
        putrirecord.print(90,95,98);
        
        //jumlah siswa
        System.out.println("\nJumlah Siswa    : "+annarecord.getStudentCount());   
    }
} 
    

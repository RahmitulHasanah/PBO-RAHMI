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
public class StudentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    private static int studentCount; 
    
    public StudentRecord(){ 
    //letak kode inisialisasi 
    studentCount++; //menambah student 
    } 
    public StudentRecord(String temp){ 
    this.name = temp; 
    studentCount++; //menambah student 
    } 
    public StudentRecord(String name, String address){ 
    this.name = name; 
    this.address = address; 
    studentCount++; //menambah student 
    } 
    public StudentRecord(double mGrade, double eGrade, double sGrade){ 
    mathGrade = mGrade; 
    englishGrade = eGrade; 
    scienceGrade = sGrade; 
    studentCount++; //menambah student 
    } 

    /** 
    * Menghasilkan nama dari Siswa 
    */ 
    public String getName(){ 
    return name; 
    } 
    /** 
    * Mengubah nama siswa 
    */ 
    public void setName( String temp ){ 
    name = temp; 
    } 
    // area penulisan kode lain 
    /** 
    * Menghitung rata – rata nilai Matematik, Bahasa Inggris, * * Ilmu 
    Pasti 
    */ 
    public double getAverage(){ 
    double result = 0; 
    result = ( mathGrade+englishGrade+scienceGrade )/3; 
    return result; 
    } 
    /** 
    * Menghasilkan jumlah instance StudentRecord 
    */ 
    public static int getStudentCount(){ 
    return studentCount; 
    } 
    public void print( String temp ){ 
    System.out.println("Name:" + name); 
    System.out.println("Address:" + address); 
    System.out.println("Age:" + age); 
    } 
    public void print(double eGrade, double mGrade, double sGrade){ 
    System.out.println("Name:" + name); 
    System.out.println("Math Grade:" + mGrade); 
    System.out.println("English Grade:" + eGrade); 
    System.out.println("Science Grade:" + sGrade);
    }
} 
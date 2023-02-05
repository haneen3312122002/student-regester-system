/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.regester_system;

/**
 *
 * @author hanee
 */
public class student {
     public  String name;
    public  int id;
    public String major;
    public double GPA;
    public static int c = 0;

    public student(String name, String major, double GPA) {
        c++;
        this.name = name;
        this.id = 20210000 + c;
        this.major = major;
        this.GPA = GPA;
    }

    public student() {
        this.name = " ";
        this.id = 20210000;

    }

    public void report() {
        System.out.println( "id" + "\t\t\t\t " + "name" + "\t\t\t\t" + "major" + "\t\t\t\t" + "GPA");
        System.out.println( id + "\t\t\t" + name + "\t\t\t\t" + major + "\t\t\t\t" + GPA);
    }

    
    
    
    
    
}

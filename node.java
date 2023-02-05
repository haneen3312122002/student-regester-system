/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.regester_system;

/**
 *
 * @author hanee
 */
public class node {
      public node next;
    student s = new student();

    public node(student s1) {
        next = null;
        s = s1;

    }

    public void print() {
        System.out.println(s);
    }

    
    
    
    
    
}

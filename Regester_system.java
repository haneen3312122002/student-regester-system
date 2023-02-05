/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompan.regester_system;

/**
 *
 * @author hanee
 */
public class Regester_system {

    public static void main(String[] args) {
        system_list l1=new system_list();
        student s1=new student("haneen ahmad khanfar","cs",90.7);
        student s5=new student("ahmad salem mohammad","ai",90.7);
        student s2=new student("ahmad  ali","mis",91.25);
        student s8=new student("yazan ahmad said","ai",91.25);
        student s3=new student("zaid karam","ai",97.25);
        l1.addstu(s1);
        l1.addstu(s2);
        l1.addstu(s3);
        l1.addstu(s5);    
        l1.addstu(s8);
        //l1.find_andPRINT_student_byID(20210003);
        System.out.println(l1.find_student_byID(20210003));
        System.out.println(l1.find_student_byNAME("zaid karam"));
        //l1.remove_student(20210001);
        //l1.search("ai");
        
       // l1.top_stu();
        
        
        
      
       
    }
}

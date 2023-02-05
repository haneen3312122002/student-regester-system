/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.regester_system;

/**
 *
 * @author hanee
 */
public class system_list {

    public int size;
    public node head;

    public system_list() {
        this.size = 0;
        this.head = null;
    }

    public boolean isempty() {
        return head == null;
    }

    public boolean isone() {
        return head.next == null;
    }

    //1 add stu
    public void addstu(student s) {
        node c = new node(s);
        if (isempty()) {
            head = c;
            size++;
        } else {
            node step = head;
            while (step.next != null) {
                step = step.next;

            }
            step.next = c;
            size++;

        }

    }

    //2 remove stu
    public void remove_student(int id) {
        System.out.println("removestudent");
        node c = head;
        if (isempty()) {
            System.out.println("no thing to remove");
        } else if (isone()) {
            if (c.s.id == id) {
                head = null;
                System.out.println("the student with id:" + id + "is removed");
                size--;
            } else {
                System.out.println(" sorry,no result");
            }
        } else {
            node pre = null;
            while (c != null) {
                if (c.s.id == id) {
                    break;
                }
                pre = c;
                c = c.next;

            }
            if (c == null) {
                System.out.println("sorry, no results");
            } else if (c == head) {
                head = head.next;
                System.out.println("the student with id:" + id + "   is removed.");
            } else {
                pre.next = c.next;
                System.out.println("the student with id:" + id + "was removed");
                size--;

            }

        }

    }

    //4 find stu and return obj
    public node find_student_byNAME(String name) {
        System.out.println("find student by name");
        node c = head;
        int count = 1;
        while (c != null) {
            if (c.s.name == name) {
                break;
            }
            c = c.next;
            count++;
        }
        if (c == null) {
            System.out.println("no results");
        } else {
            System.out.println("student number in the list is:" + count);
            return c;
        }
        return c;

    }

    //5 find stu and return obj
    public node find_student_byID(int id) {
        System.out.println("find student by id");
        node c = head;
        int count = 1;
        while (c != null) {
            if (c.s.id == id) {
                break;
            }
            count++;
            c = c.next;
        }
        if (c == null) {
            System.out.println("no results");
        } else {
            System.out.println("student number in the list is:" + count);
            return c;
        }
        return c;

    }

    //7 to find stu with id, and print its data
    public void find_andPRINT_student_byID(int id) {
        System.out.println("find by id and print data");
        node c = head;
        while (c != null) {
            if (c.s.id == id) {
                break;
            }
            c = c.next;
        }
        if (c == null) {
            System.out.println("sorry, no results.");
        } else {
            c.s.report();
        }

    }

    // print data
    public void print() {
        node c = head;
        while (c != null) {
            c.s.report();
            c = c.next;
        }

    }

    //6 to find the top stu with top GPA
    public void top_stu() {
        System.out.println("top student");

        node c = head;
        double max = c.s.GPA;
        while (c.next != null) {
            if (c.s.GPA < c.next.s.GPA) {
                max = c.next.s.GPA;
            }

            c = c.next;

        }
        node s = head;
        while (s != null) {
            if (s.s.GPA == max) {
                break;
            }
            s = s.next;
        }
        s.s.report();

    }

    public void search(String major) {
        System.out.println("search by major");
        major_list m = new major_list();
        node c = head;
        while (c != null) {
            if (c.s.major.equals(major)) {
                m.addstu(c.s);

            }
            c = c.next;
            

        }
         m.sort_by_name();
             m.print();
       
        
    }
}



}

}

class major_list {

    public int size;
    public node head;

    public major_list() {
        this.size = 0;
        this.head = null;
    }

    public boolean isempty() {
        return head == null;
    }

    public boolean isone() {
        return head.next == null;
    }

    //1 add stu
    public void addstu(student s) {
        node c = new node(s);
        if (isempty()) {
            head = c;
            size++;
        } else {
            node step = head;
            while (step.next != null) {
                step = step.next;

            }
            step.next = c;
            size++;

        }

    }

    public void sort_by_name() {
        node c = head;
        node pre = null;
        student temp;
//        int id;
//        String name;
//        String major;
//        double gpa;
        while (c != null) {
            pre = c;
            while (pre != null) {
                if (c.s.name.compareTo(pre.s.name) > 0) {

                    temp = c.s;
                    c.s = pre.s;
                    pre.s = temp;

                }
                pre = pre.next;

            }
            c = c.next;

        }
        

    }

    public void print() {

        node s = head;
        while (s != null) {
            s.s.report();
            s = s.next;

        }

    }
}

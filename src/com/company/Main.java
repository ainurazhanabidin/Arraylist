package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Asan",25));
            students.add(new Student("Usun",-35));
            students.add(new Student(null));
            students.add(new Student("Faiz",27));


            for (Student student : students) {
                System.out.println(student);

            }


        }catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (InputMismatchException m){
            System.out.println(m.getMessage());
        }
        finally {
            System.out.println("Buttu!");

        }


















//        array.add(1);
//        array.add(-3);
//        array.add(null);
//        for (int a:array) {
//            System.out.println(a);
//
//        }
//        try {
//            System.out.println("Studenttin jashy: ");
//            int a= scanner.nextInt();
//            if (a<0){
//                throw new Exception("Studenttin jashy ters bolbosh kerek! ");
//            }
//            Student student=new Student("asan",30);
//
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//



//        array.add(3);
//        array.add(89);
//        array.add(987);
//        array.add(9);
//        array.add(8);
//
//        array.add(2,2);
//
//        for (int a:array) {
//            System.out.println(a);
//
//        }





        
    }
}

package Java_Coding_Programming;

import java.lang.*;
public class SubString {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            String a="java is a programing language";
            String b="programing";
            if(a.contains(b)){
                System.out.println("it is a substring");
            }
            else{
                System.out.println("it is not a substring");
            }

            String[] d=a.split(" ");
            System.out.println(d.length);
            System.out.println(d[0]);

            for(String e:d){
                if(e.equals(b)){
                    System.out.println("yes it is substring");
                }
            }
        }
    }


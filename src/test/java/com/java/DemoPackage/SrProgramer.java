package com.java.DemoPackage;

public class SrProgramer {
     int sal = 5000;


    void dilspaly(){
        System.out.println(" this is jr. class: "+ sal);


    }

}

class JrProgram extends SrProgramer{

     int sal = 10000;

    void dilspaly(){
        System.out.println(" this is Sr. class--> " + sal);

        }

        void sal(){
        super.dilspaly();
         dilspaly();
        }


    public static void main(String[] args){

        JrProgram jr = new JrProgram();

         jr.sal();


    }

}

// Important note: Super can not be called from any static area.
// Inner class can't be public; Only main class has to be public.

//https://www.youtube.com/watch?v=jUJ4CMPFkM4



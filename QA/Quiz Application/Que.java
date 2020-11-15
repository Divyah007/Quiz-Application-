package com.qa;


/*
*----------- Question class------------
* declare the variables for
* 1) question
* 2) options (4 options)
* 3) correct answer
* 4) user answer
*
* display the question and options and get the user answer*/
import java.util.Scanner;
public class Que {
    public String qu;
    public String o1;
    public String o2;
    public String o3;
    public String o4;
    public String ca;
    public String ua;
    Scanner s=new Scanner(System.in);
    public void display()
    {

        System.out.println(qu);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println("ANSWER : ");
        ua=s.nextLine();


    }

}

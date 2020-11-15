package com.qa;
/* ----------PLAYER CLASS----------
* declare the variables
* 1)player name
* 2) player score and initialize it with 0
*
* define a method to get user name*/
import java.util.Scanner;
public class Pl {
    public String na;
    public int so=0;
    Scanner s=new Scanner(System.in);
    public void gun()
    {
        System.out.println();
        System.out.println();
        System.out.println("ENTER YOUR NAME:");
        na=s.nextLine();
    }

}

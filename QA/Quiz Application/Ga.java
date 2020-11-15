package com.qa;
import java.util.Scanner;
/* -------GAME CLASS------------
* 1) give the dataset consisting of,
* a)question
* b)options (4 options)
* c) correct answer
* d) user answer
* by creating array*/
public class Ga {
    Scanner s=new Scanner(System.in);

    // int[n] a={a[0],a[1],...a[n-1]}
    Que[] q = new Que[10]; // just like creating array of type Que.
public void a()

    {

        //array for questions
        String[] ques = {"1) One GigaByte(GB) is equal to?",
                "2) Who developed Java programming language?",
                "3) Which is the oldest coding language?",
                "4) Which is the brain of any computer system?",
                "5) Which of the following computer language is used for artificial intelligence?",
                "6) Which of the following is the 1's complement of 10?",
                "7) The binary system uses which of the following powers?",
                "8) A computer program that converts assembly language to machine language is known as?",
                "9) A common boundary between two systems is called as?",
                "10) Which computer has been designed to be as compact as possible?"};

        // array for option 1
        String[] p1 = {"A. 1,024 MB","A. Bill Joy", "A. Fortran", "A. ALU", "A. FORTRAN", "A. 01", "A. 2", "A. Compiler", "A. Interdiction", "A. Mini"};
        // array for option 2
        String[] p2 = {"B. 1,000 MB", "B. Charles Babbage", "B. Lisp", "B. Memory", "B. PROLOG", "B. 110", "B. 10", "B. Interpreter", "B. Interface", "B. Super computer"};
        // array for option 3
        String[] p3 = {"C. 1,200 MB", "C. James Gosling", "C. Pascal", "C. CPU", "C. C", "C. 11", "C. 8", "C. Assembler", "C. Surface", "C. Micro computer"};
//array for option 4
        String[] p4 = {"D. None of the above", "D. None of the above", "D. None of the above", "D. None of the above", "D. None of the above", "D. None of the above", "D. None of the above", "D. None of the above", "D. None of the above", "D. None of the above",};
// array for correct answers
        String[] cans = {"A", "C", "A", "C", "B", "A", "A", "C", "B", "C"};

        // creating objects for question class using array
        // just creating blank objects

        //10 because we have 10 set of questions
        for (int i = 0; i < 10; i++) {
            q[i] = new Que();// allocating space
            q[i].qu = ques[i];// assigning values
            q[i].o1 = p1[i];// assigning values
            q[i].o2 = p2[i];// assigning values
            q[i].o3 = p3[i];// assigning values
            q[i].o4 = p4[i];// assigning values
            q[i].ca = cans[i];// assigning values
        }
//displaying the questions and options and getting answer from the user
        // and evaluating the answer
    }
    Pl p =new Pl();// creating object for pl class

    public void play() {
        String f;
        String w; //

        do { //

            p.gun();
        System.out.println("QUESTIONS");
    for (int i = 0; i < 10; i++)
    {
    q[i].display();

        if ((q[i].ua).equalsIgnoreCase(q[i].ca))
        {
         System.out.println("RIGHT ANSWER");
         p.so = p.so + 10;
        }
        else
         {
             if ((q[i].ua).equalsIgnoreCase("A") || (q[i].ua).equalsIgnoreCase("B") || (q[i].ua).equalsIgnoreCase("C") || (q[i].ua).equalsIgnoreCase("D"))
              {
               System.out.println("WRONG ANSWER");
               p.so = p.so;
               }
               else
               {
               System.out.println("INVALID ANSWER");
               System.out.println("Please enter the valid option (A/B/C/D), otherwise the answer will be marked as WRONG!");
               f = s.next();
                        if (f.equalsIgnoreCase(q[i].ca))
                        {
                        System.out.println("RIGHT ANSWER");
                        p.so = p.so + 10;
                        }
                        else
                        {
                        System.out.println("WRONG ANSWER");
                        p.so = p.so;
                        }
               }

         }
        System.out.println();
    }
                    System.out.println((p.na).toUpperCase()+" YOUR SCORE IS: " + p.so);
        System.out.println();
                p.so=0;
                   System.out.println("Would you like to play again? (yes/no)");//
                    w = s.next();//

        }
           while ((w).equalsIgnoreCase("yes")); //

        }
    }

    /*
    * ANSWERS
    * 1 A
    * 2 C
    * 3 A
    * 4 C
    * 5 B
    * 6 A
    * 7 A
    * 8 C
    * 9 B
    * 10 C*/




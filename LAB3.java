import java.util.Random;
import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args){
       Scanner input= new Scanner(System.in);
       //Task01
       /*A.	Take values of length and breadth of a rectangle from user and check if it is square or not. */
       /*
       System.out.println("Enter length of the shape: ");
       int length=input.nextInt();
       System.out.println("Enter breath of the shape: ");
       int breath=input.nextInt();
       if(breath==length){
           System.out.println("It's a square.");
       }else{
           System.out.println("It's rectangle.");
       }*/
      //Task02
       /*B.	A school has following rules for grading system:
        Below 25 F
        25 to 45 E
        45 to 50 D
        50 to 60 C
        60 to 80 B
        Above 80 A
        */
       
       /*
       System.out.println("Enter marks: ");
       int marks=input.nextInt();
       if(marks>80){
           System.out.println("Grade: A");
       }
       else if(marks<=80 && marks>=60){
           System.out.println("Grade: B");
       }
       else if(marks<=60 && marks>=50){
           System.out.println("Grade: C");
       }
       else if(marks<=50 && marks>=45){
           System.out.println("Grade: D");
       }
       else if(marks<=45 && marks>=25){
           System.out.println("Grade: E");
       }else{
           System.out.println("Grade: F");
       }*/


       //Task03
       /*C.	A student will not be allowed to sit in exam if his/her attendance is less than 75%. Take following input from user, Number of classes held, Number of classes attended and print percentage of class attended. Is student is allowed to sit in exam or not.
        */
       /*  
       System.out.println("Enter number of class you attended: ");
       int ClassTaken=input.nextInt();
       System.out.println("Enter Total number of class: ");
       int TotalClasses=input.nextInt();

       double attandence=((double)ClassTaken/TotalClasses)*100;
       
       if(attandence>75){
           System.out.println("you can take the exam.");
       }else{
           System.out.println("you can not take the exam "+attandence);
       }*/
       //Task04      
       /*System.out.println("Enter a age number 1: ");
       int age1=input.nextInt();
       System.out.println("Enter a age number 2: ");
       int age2=input.nextInt();
       System.out.println("Enter a age number 1: ");
       int age3=input.nextInt();
       if(age1>age2 && age1>age3){
        System.out.println("Age number 1 is older than age number 2 and age number 3.");
       }
       else if(age2>age1 && age2>age3){
        System.out.println("Age number 2 is older than age number 1 and age number 3.");
       }else if(age3>age1 && age3>age2){
        System.out.println("Age number 3 is older than age number 2 and age number 1.");
       }else{
        System.out.println("Age number 1, age number 2 and age number 3 are at sane age.");
       }*/
       

       //Task05
       /*E.	Write a program that generates a random number between 1 and 25, then converts that number to its corresponding character using ASCII values. */

       /*int randomNumber=(int)(Math.random()*25);
       System.out.println("Random Number: "+randomNumber);
       char ASCII=(char)randomNumber;

       System.out.println(randomNumber+" convert ASCII value to"+ASCII);
       */
      //Task06
      /*F.	Write a program that calculates the distance between two points (x1, y1) and (x2, y2) using the distance formula, which involves Math.sqrt. d=√((x_2-x_1)²+(y_2-y_1)²) */
      
      /* 
      System.out.println("Enter x1:");
      int x1=input.nextInt();
      System.out.println("Enter x2:");
      int x2=input.nextInt();
      System.out.println("Enter y1:");
      int y1=input.nextInt();
      System.out.println("Enter y2:");
      int y2=input.nextInt();
      double distance=Math.pow(Math.pow(x2+x1,2)+Math.pow(y2+y1,2), 1/2);
      System.out.println("The distance of the given point is "+distance);
      */
      //Task07
      /*G.	Write a program that takes two numbers as input, base and exponent, and calculates the result of base raised to the power of exponent using Math.pow. */
      
      /*System.out.println("Enter base:");
      int base=input.nextInt();
      System.out.println("Enter exponet:");
      int exponent=input.nextInt();
      double result=Math.pow(base,exponent);
      System.out.println("The " + base + " raised to the power of "+exponent+" is "+result);
      */

      
    }
    
}

import java.util.Scanner;
public class LAB2 {
    public static void main (String[] args){
        //Task01
        /*Create a Java application for a basic calculator with the following capabilities:
        Addition and Subtraction
        Division, Exponentiation, and Multiplication
        */
        Scanner input= new Scanner(System.in);
        System.out.println();
        int num1=input.nextInt();
        int num2=input.nextInt();
        String operator=input.next();
        if(operator == "+"){
            double result=num1+num2;

        }else if(operator == "x"){
            double result=num1*num2;
        }
        else if(operator == "/"){
            double result=num1/num2;
        }
        else if(operator == "-"){
            double result=num1-num2;
        }
        else if(operator =="**"){
            double result=Math.pow(num1,num2);
        }


    }
    
}

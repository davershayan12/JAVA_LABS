import java.util.Scanner;

public class LAB4 {
    public static void main(String[] args){
            /*A.	Write a program using switch which choose between following cases:
        a: Add two numbers
        b: Find power using math function
        c: Exit*/
        Scanner input = new Scanner(System.in);

        /*System.out.println("Enter Your Choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Number 1");
                int num1 = input.nextInt();
                System.out.println("Number 2");
                int num2 = input.nextInt();
                System.out.println("Addition of both numbers: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Enter Base");
                int Base = input.nextInt();
                System.out.println("Enter exponent");
                int exp = input.nextInt();
                System.out.println(Math.pow(Base, exp));
                break;
            case 3:
                 break; */
        /*B.	Write a program in Java to calculate the total cost of items purchased based on their category. The program should prompt the user to enter the category of the item (1 for electronics, 2 for groceries, and 3 for clothing) and the amount spent on that category. Then, calculate and display the total amount spent on each category separately. Use a switch-case statement to implement this program. */
        /*int GroceriesAmount = 0, ElectronicsAmount = 0, ClothingAmount = 0;
        System.out.println("Enter Your Choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount spended on Electronics"); 
                ElectronicsAmount = input.nextInt();
                System.out.println("The Amount spent on Electronics is:" + ElectronicsAmount); 
               

            case 2:
                System.out.println("Enter the amount spended on Groceries");
                GroceriesAmount = input.nextInt();
                System.out.println("The Amount spent on Groceries is:" + GroceriesAmount); 

            case 3:
                System.out.println("Enter the amount spended on Clothing"); 
                ClothingAmount = input.nextInt();
        }
        double SumOfAllAmount = ElectronicsAmount + GroceriesAmount + ClothingAmount;
        System.out.println(SumOfAllAmount);*/

        /*C.	Write a program in Java to convert a numerical grade into a letter grade. The program should prompt the user to enter a numerical grade between 0 and 100 and then display the corresponding letter grade based on the following grading scale:
        This image shows a grading scale:

        * 90-100: A
        * 80-89: B
        * 70-79: C
        * 60-69: D
        * Below 60: F
         */
        /*System.out.print("enter marks:");
        int num1 = input.nextInt();
        int num = (int) num1 / 10;
        switch (num) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }*/


        /*D.	Write a program in Java to calculate the area of different geometric shapes. The program should prompt the user to choose the shape (1 for circle, 2 for rectangle, and 3 for triangle) and then input the necessary parameters (radius for circle, length and width for rectangle, and base and height for triangle). Finally, calculate and display the area of the chosen shape. Use a switch-case statement to implement this program. */

        /*System.out.print("Enter your choice (1 for Circle, 2 for Rectangle, 3 for Triangle): ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.print("Enter Radius: ");
                double rad = input.nextDouble();
                double circleArea = Math.PI * rad * rad;
                System.out.println("Area: " + circleArea);
                break;
            case 2:
                System.out.print("Enter length: ");
                double length = input.nextDouble();
                System.out.print("Enter width: ");
                double width = input.nextDouble();
                double rectangleArea = width * length;
                System.out.println("Area: " + rectangleArea);
                break;
            case 3:
                System.out.print("Enter height: ");
                double height = input.nextDouble();
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                double triangleArea = 0.5 * height * base;
                System.out.println("Area: " + triangleArea);
                break;
            default:
                System.out.println("Invalid choice.");
        }*/

        /*F.	Write a program in java in which print 20 to 30 numbers using for loop. */
        /*for (int i = 20; i <= 30; i++) {
            System.out.println("i = " + i);
        }*/

        /*G.	Write a program in java and print table of 2 using do while loop */
        /*        
        int i = 1;
        int j = 2;
        do {
            System.out.println(j + " x " + i + " = " + j * i);
            i++;
        } while (i <= 10); */

        /*I.	Write a program to print odd number from 1 to 100 using all three loops */
        /*
                int i = 0;
        do {
            for (int j = 0; j <= 100; j++) {
                int x = 1;
                while (x <= 100) {
                    if (x % 2 != 0) {
                        System.out.println(x);
                    }
                    x++;
                }
                break;
            }
            i++;
        } while (i <= 0);
         */

    }    
    
}

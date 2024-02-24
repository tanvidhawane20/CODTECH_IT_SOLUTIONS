import java.util.Scanner;

public class Calculator 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        

        System.out.println("Simple Calculator");
        System.out.println("__________________");
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();

        System.out.println("Choose a number to perform Operation: 1.Addition 2.Substraction 3.Multiplication 4.Division ");
        System.out.println(" 1 ");
        System.out.println(" 2 ");
        System.out.println(" 3 ");
        System.out.println(" 4 ");
        String choice= sc.next();
        
        switch (choice) 
        {
            
            case "1":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case "2":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case "3":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case "4":
                if (num2 != 0)
                 {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                 }
                 else 
                 {
                    System.out.println("Cannot divide by zero!");
                 }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        
    }
}

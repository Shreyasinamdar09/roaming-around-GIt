
import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        /*System.out.println("Enter num1");
        int a = ob.nextInt();
       
        System.out.println("Enter num2");
        double b = ob.nextDouble();
        double add = a+b;
        
        System.out.println("Addition of two numbers are = "+add);*/

        System.out.println("Enter your name:");
       String name = ob.nextLine();

        System.out.println("Enter your year of birth:");
        int DOB = ob.nextInt();
        int age = 2024-DOB;
        System.out.println("\nHI "+name+"\nYour age is = "+age);

        ob.close();
    }
}
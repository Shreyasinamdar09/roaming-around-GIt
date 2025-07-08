import java.util.*;
public class Functions {
    
    /*
    public static void myName(String name){
        System.out.println("Your Name: "+name);
        return;
    }

    public static int addNumbers(int num1, int num2){
        int sum = num1 + num2;
        return sum ;
    }

    public static double product(double no1, double no2){
        return no1 * no2;
    }
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = ob.nextLine();

        System.out.print("Enter num 1: ");
        int num1 = ob.nextInt();
        System.out.print("Enter num2: ");
        int num2 = ob.nextInt();

        System.out.print("Enter num 1 for product: ");
        Double no1 = ob.nextDouble();
        System.out.print("Enter num2 for product: ");
        Double no2 = ob.nextDouble();

        myName(name); //call function
        
        int sum = addNumbers(num1, num2);
        System.out.println("addition of two numbers are: "+sum);

        System.out.println("Product of two numbers:"+ product(no1 , no2));
        */

        public static void factorial(int n){
             if(n<0){
                System.out.println("Enter positive number");
                return;
            }
            int num =1;
                for(int i=n ;i>=1; i--){
                num = num*i; 
            }
            System.out.println("factorial of: "+n+"is: "+num);
            return;
        }
        public static void main(String[] args) {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = ob.nextInt();

            factorial(n);

            ob.close();
            
        }
    }


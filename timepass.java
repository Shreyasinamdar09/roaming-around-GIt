import java.util.*;
public class timepass{


    /* 1
    public static int average(int a, int b, int c){
        return (a+b+c)/3;       //return the average
    }
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("first no: ");
        int a = ob.nextInt();
        System.out.print("second no: ");
        int b = ob.nextInt();
        System.out.print("third no: ");
        int c =ob.nextInt();
        
        System.out.println("Average of three numbers are: "+average(a, b, c));  //call function
        }
    */


    /* 2
    public static void oddNumberSum(int n){
        int sum=0;
        for(int i=3; i<=n; i++){
            if((i%2)==1){
                
                sum = sum+i;
            }
        }
        System.out.println("Sum of odd numbers from 0 to " + n + " is: "+sum);
    }
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = ob.nextInt();

        oddNumberSum(n);
    }
    */
    

    /* 3
    public static void greater(int a, int b){
        if(a>b){
            System.out.println(a + " is greater than "+b);
        }
        else{
            System.out.println(b + " is greater than "+a);
        }
    }
    public static void main(String args[]){
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter first number: " );
        int a = ob.nextInt();
        System.out.println("Enter second number: ");
        int b = ob.nextInt();

        greater(a, b);
    }
    */


    /* 4
    public static Double Circumference(double r){
        return(2*3.142*r);
    }
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        Double r = ob.nextDouble();

        System.out.println("Circumference of circle with radis:"+r +" is " + Circumference(r));
    }
     */
    
    
    /* 5
     public static void eligible (int age){
        if(age>18){
            System.out.println("you are eligible to vote ");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
        return;
     }
     public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = ob.nextInt();

        eligible(age);
     }
     */
    
  
    /* 6 fucked
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add:");
        int n = ob.nextInt();
     
        int positive = 0;
        int negative = 0;
        int zero = 0;
     
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            int num = ob.nextInt();
     
            if (num > 0) {
            positive++;
            } 
            else if (num < 0) {
            negative++;
            } 
            else {
            zero++;
            }
        }
             System.out.println("Number of positive numbers: " + positive);
             System.out.println("Number of negative numbers: " + negative);
             System.out.println("Number of zero numbers: " + zero);
         }
        */

        
        /* 7 look more
        public static void main(String[] args)   
        {  
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        int gcd = 1;  
        for(int i = 1; i <= a && i <= b; i++)  
        {  
        if(a%i==0 && b%i==0)  
        gcd = i;  
        }  
        System.out.printf("GCD of %d and %d is: %d", a, b, gcd);  
        }
        */ 


        /* 8  series Fibonacci
            public static void main(String args[])  
            {    
             int n1=0,n2=1,n3,count=10;    
             System.out.print(n1+" "+n2);//print 0 and 1    
                
             for(int i=2;i<=count;i++)//loop starts from 2 because 0 and 1 are already printed    
             {    
              n3=n1+n2;    
              System.out.print(" "+n3);    
              n1=n2;    
              n2=n3;    
             }     
            }
         */
}  
     
       

  
    
 

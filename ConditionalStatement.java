import java.util.*;

public class ConditionalStatement {
    public static void main(String args[]){
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int no = ob.nextInt();

        System.out.println("Enter number2");
        int num = ob.nextInt();
        if(no == num){
            System.out.println("both number are equal");
        }
        else if(no >num){
            System.out.println("number 1 is greater than number2");
        }
        else {
            System.out.println("number2 is greater than number1");
        }
            


        switch(no){
            case 1 : System.out.println("WOW");
            break;
            case 2 : System.out.println("EWW");
            break;
            case 3 : System.out.println("HEY");
            break;
            default : System.out.println("Nothing");
        }
        ob.close();
    }
}

import java.util.*;
public class Array {
    public static void main(String args[]){
        
        /* 
        //int marks[] = new int[5];
        //marks[0]=1;
        //marks[1]=2;
        //marks[2]=3;
        //marks[3]=4;
        //marks[4]=5;

        int marks[]={1,2,3,4};
        
        for(int i=0;i<=4;i++){
            System.out.println(marks[i]);
        }
        */

        Scanner ob=new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int size = ob.nextInt();
        int num[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter numbers: ");
            num[i]=ob.nextInt();


        }
        
        for (int i=0; i<size; i++){
            System.out.println("Numbers are:"+ num[i]);

        }

        for(int element : num){
            System.out.println(element);
        }
        

        ob.close();
    }
}

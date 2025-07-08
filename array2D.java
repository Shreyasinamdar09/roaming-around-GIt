import java.util.*;
public class array2D {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int r = ob.nextInt();
        System.out.println("Enter number of column: ");
        int c = ob.nextInt();

        int[][] Matrix = new int[r][c];
        
        
        System.out.println("enter elements: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                Matrix[i][j] = ob.nextInt();
            }
        }
        
        
        System.out.println("Enter number you want to search: ");
        int x = ob.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                
                if(Matrix[i][j] == x ){
                    System.out.println("number is found at: "+ i +" , "+j);
                }
            }
        }
        
        //System.out.println("matrix is : ");
        //for(int i=0 ; i<r; i++){
        //    for(int j=0; j<c; j++){
        //        System.out.print( Matrix[i][j]+ " ");
        //    
        //    }//
        //    System.out.println();
        //}

        ob.close();
        
    }
}




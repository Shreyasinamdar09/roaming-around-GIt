public class patterns {

    public static void main(String args[]){
        
        
        //1. Soilid rectangle
        /*
        for (int i=1; i<=4; i++){
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        
        //2. Hollow rectangle
        /* 
        for(int i = 1;i<=5;i++){
            for(int j= 1; j<=5; j++){
                if(i==1 || i==5 || j==1||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */


        //3. Half pyramid
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" 1");
            }
            System.out.println();
        }
         

        //4. Inverted Half pyramid
        /*
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */


        //5. Half pyramid opposite 
        /*
        for (int i=1; i<=10; i++){
            for(int j=1; j<=10-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //6. Half pyramid with numbers
        /* 
        for (int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
         */

        //7. Inverted half pyramid with numbers
        /* 
        for(int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */


        //8. Floyd's triangle
        /* 
        int num=1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
        System.out.println();
        }
        */


        //9. 0-1 triangle
        /* 
        for(int i=1; i<=7; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        */


        //10. Butterfly pattern
        /* 
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2*(5-i);
            for (int j=1; j<=spaces; j++){
            System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd part
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            int space = 2*(5-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        //11. Solid rohmbus
        /* 
        for(int i=1; i<=7; i++){
            int space = 7-i;
            for (int j=1; j<=space; j++)
            System.out.print(" ");
            for(int j=1; j<=7; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        //12. number pyramid
        /* 
        for(int i=1; i<=7; i++){
            for (int j=1; j<=7 - i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        */


        //13. palindrome pattern
        /*
        for(int i=1; i<=6; i++){
            for (int j=1; j<=6-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for (int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
         */
        

         //14. Diamond
         /*
         
         for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for (int j= 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
         }
         for(int i=5; i>=1; i--){
            for (int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
         }
         */
    
        
        }


}

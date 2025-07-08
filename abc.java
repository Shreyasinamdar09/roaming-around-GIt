import java.util.*;
interface shape{
    void area();
}
class square implements shape
{
int side;

square(int side)
{

this.side=side;

}


public void area()
{

int area;
area=side*side;
System.out.println("area is"+area);

}


}
 class abc {
    public static void main(String[] args) 
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the side");
        int s;
       s=ob.nextInt();
       square o=new square(s);





    }
}

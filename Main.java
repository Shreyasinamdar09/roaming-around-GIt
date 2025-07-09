class a{
    int x;
    a(){
        System.out.println("1");
    }
     void main(){
        System.out.println("1 method");
}
}
class b extends a{
 
// b()
// {qwddqwdqdddddd
//     super.main();
//      System.out.println(super.x);
// }
    //  void main(){
    //     System.out.println("child ");
    // }
    void show(){
        System.out.println("up casting");
    }
}
public class Main {

     public static void main(String[] args) {
       
        b ob=new b();
        // b ob2 = (b) ob; 
        ob.main();
        // ob2`.show();

     }
}
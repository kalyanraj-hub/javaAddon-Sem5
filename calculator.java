
import java.util.*;
class Calculator{
    public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       System.out.println("1.ADDITION");
       System.out.println("2.SUBTRACTION");
       System.out.println("3.MULTIPLICATION");
       System.out.println("4.DIVISION");
       System.out.println("Enter the value of a");
       float a =s.nextInt();
       System.out.println("Enter the value of b");
       float b =s.nextInt();
       System.out.println("Enter the choice");
       int choose =s.nextInt();
       switch(choose){
       case 1:
       {
           System.out.println(a+b);
           break;
       }
       case 2:
       {
            System.out.println(a-b);
           break;
       }
       case 3:
       {    System.out.println(a*b);
       break;
       }
       case 4:
       {
            System.out.println(a/b);
           break;
       }
       default:{
           System.out.println("option invalid. try again");
           
       }
       
       }
    }
}

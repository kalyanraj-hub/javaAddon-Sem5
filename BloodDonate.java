import java.util.*;

class BloodDonate {
    public static void main(String[] args) {
        int age;
        float w;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the age: ");
        age = in.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to donate blood");
        } else {
            System.out.println("Not eligible");
        }
        System.out.println("enter the weight");
        w = in.nextInt();
        if(w<50)
        {
            System.out.println("not  eligible");
            }else
            {System.out.println("eligible");
        }

        in.close();
    }
}

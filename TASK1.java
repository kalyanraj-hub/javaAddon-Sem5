import java.util.*;

class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int a = s.nextInt();

        System.out.print("Enter the ending value: ");
        int end = s.nextInt();

        for (int i = a; i < end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(" ");
            }
        }

        s.close();
    }
}

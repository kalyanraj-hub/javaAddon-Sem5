package program;
import java.util.Random;
import java.util.Scanner;

public class GenerateOTP {
    public static int generateOTP() {
        Random ran = new Random();
        return 1000 + ran.nextInt(5000);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = in.nextLong();

        long validNumber = 123456789L;
        int otp = generateOTP();  

        if (num == validNumber) {
            System.out.println("One-time password is: " + otp);
            System.out.println("Verified");
        } else {
            System.out.println("Invalid");
        }

        in.close(); 
    }
}

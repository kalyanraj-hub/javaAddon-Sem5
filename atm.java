import java.util.*;

class Atm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to ATM");
        System.out.print("Enter the PIN: ");
        int pin = s.nextInt();

        if (pin == 1234) {
            System.out.print("Enter the amount: ");
            int bal = s.nextInt();

            if (bal <= 5000) {
                System.out.println("Transaction successful! Amount withdrawn: " + bal);
            } else {
                System.out.println("INSUFFICIENT FUNDS!");
            }
        } else {
            System.out.println("Invalid PIN! ");
        }

        s.close();
    }
}

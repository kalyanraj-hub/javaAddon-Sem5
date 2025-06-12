import java.io.*;
import java.util.*;

class EmployeeSystem {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add  2.View  3.Delete  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine(); 

            if (ch == 1) {
                FileWriter fw = new FileWriter("employees.txt", true);
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Dept: ");
                String dept = sc.nextLine();
                System.out.print("Salary: ");
                String sal = sc.nextLine();
                fw.write(id + "," + name + "," + dept + "," + sal + "\n");
                fw.close();
                System.out.println("Employee Added.");
            }

            else if (ch == 2) {
                BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] p = line.split(",");
                    System.out.println("ID: " + p[0] + ", Name: " + p[1] + ", Dept: " + p[2] + ", Salary: " + p[3]);
                }
                br.close();
            }

            else if (ch == 3) {
                System.out.print("Enter ID to delete: ");
                String did = sc.nextLine();
                File f1 = new File("employees.txt");
                File f2 = new File("temp.txt");

                BufferedReader br = new BufferedReader(new FileReader(f1));
                BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
                String line;
                while ((line = br.readLine()) != null) {
                    if (!line.startsWith(did + ",")) {
                        bw.write(line + "\n");
                    }
                }
                br.close();
                bw.close();
                f1.delete();
                f2.renameTo(f1);
                System.out.println("Employee Deleted.");
            }

            else if (ch == 4) {
                System.out.println("Exiting.");
                break;
            }

            else {
                System.out.println("Invalid Choice.");
            }
        }
    }
}
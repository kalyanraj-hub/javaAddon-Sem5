package javaAddon;
import java.io.*;
import java.util.*;

public class StudentFileProcessor {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "result.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("John,101\n");
            writer.write("Alice,102\n");
            writer.write("Bob,103\n");
            writer.write("Diana,104\n");
            writer.write("Sam,105\n");
            System.out.println("Student data written to " + inputFile);
        } catch (IOException e) {
            System.out.println("Error writing student file: " + e.getMessage());
        }

        int total = 0;
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    int roll = Integer.parseInt(parts[1]);
                    sum += roll;
                    total++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        double average = total > 0 ? (double) sum / total : 0;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Total Students: " + total + "\n");
            writer.write("Average Roll Number: " + average + "\n");
            System.out.println("Result written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing result file: " + e.getMessage());
        }
    }
}

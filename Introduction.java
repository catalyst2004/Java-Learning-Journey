import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter your name:");
        String name = scn.nextLine();
        System.out.print("What is your Age:");
        int age = scn.nextInt();
        System.out.print("Enter your Department:");
        String department = scn.nextLine();
        System.out.print("Enter your Year:");
        int year = scn.nextInt();
        System.out.println("----------------------------------------------------");
        System.out.println("Your Details:");
        System.out.println("Name: " +name);
        System.out.println("Age:" +age);
        System.out.println("Department: " +department);
        System.out.println("Year: " +year+ "nd");
        System.out.println("------------------------------------------------------");

    }
}
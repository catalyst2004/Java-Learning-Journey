
import java.util.Scanner;
public class practise_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //taking three numbers as input from the user
        System.out.print("Enter the first number:");
        float first = scn.nextFloat();
        System.out.print("Enter the Second number:");
        float second = scn.nextFloat();
        System.out.print("Enter the Third number:");
        float third = scn.nextFloat();
        // displaying all the three numbers
        System.out.println("You have entered the numbers: 1. " +first+ " 2. " +second+ " 3. " +third );
        //Conditions to find the largest of all three
        if(first>second && first>third) {
            System.out.println("The largest number is " +first);
        } else if (first<second && second>third) {
            System.out.println("The largest number is " +second);
        }
        else{
            System.out.println("The largest number is " +third);
        }
        scn.close();
    }
}

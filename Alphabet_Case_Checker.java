//Alphabet Case-Checker of a given string as input from the user....
import java.util.Arrays;
import java.util.Scanner;
public class Alphabet_Case_Checker {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = scn.nextLine().trim();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            //skipping the whitespace characters in between words...
            if (Character.isWhitespace(ch)){
                continue;
            }
            if (ch >= 'a' && ch <= 'z') {
                System.out.println(" " + ch + ": Lowercase character!!");
            } else if(ch >= 'A' && ch <= 'Z') {
                System.out.println(" " + ch + ": Uppercase Character!!");
            }else{
                System.out.println("Not an Alphabet character!");
            }
        }
        scn.close();
    }
}

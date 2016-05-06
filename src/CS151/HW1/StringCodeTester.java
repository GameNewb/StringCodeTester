/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS151.HW1;

/**
 *
 * @author Kiyeon
 */
import java.util.Scanner;

public class StringCodeTester 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        StringCode stringCode;
        String userString;

        
        System.out.println("Test blowup:");
        System.out.println(StringCode.blowup("xx3abb"));
        System.out.println(StringCode.blowup("2x3Z"));
        System.out.println(StringCode.blowup("a3tx2y"));
        
        System.out.println("\nPlease enter a string with numbers");
        userString = input.nextLine();
        System.out.println("\n" + userString + " expands to " + StringCode.blowup(userString));
        
        
        System.out.println("The longest run of the string " + StringCode.blowup(userString) + " is: " + StringCode.maxRun(userString));
        System.out.println("The longest run of the string is xxyyyz: " + StringCode.maxRun("xxyyyz"));

        System.out.println(StringCode.maxRun("abbcccddbbbxx"));
        System.out.println(StringCode.maxRun(""));
        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS151.HW1;

/**
 *
 * @author Kiyeon 
 * Kyle Del Castillo
 * CS 151 - Object Oriented Design
 * Spring 2016 
 */

import java.util.Scanner;

public class V2Tester 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        V2 vector1 = new V2(2.1, 1.1);
        V2 vector2 = new V2(3.4, 1.5);
        V2 vectorSum;
        V2 vectorProduct;
        V2 vectorScalarProduct;
        int scalar = 0;
        /*
        System.out.println("Vector 1: \nX: " + vector1.getX() + "\n" + "Y: " + vector1.getY());
        System.out.println("Vector 2: \nX: " + vector2.getX() + "\n" + "Y: " + vector2.getY());
        */
        vectorSum = vector1.addVector(vector2); //Set new vector sum object
        vectorProduct = vector1.multiplyVector(vector2); //Set new vector product object
        /*
        System.out.println("\nVector Sum: \nX: " + vectorSum.getX() + "\n" + "Y: " + vectorSum.getY());
        
        System.out.println("\nVector Product: \nX: " + vectorProduct.getX() + "\n" + "Y: " + vectorProduct.getY());
        
        System.out.print("\nPlease enter a scalar number: ");
        scalar = input.nextInt();
        */
        vectorScalarProduct = vector1.multiplyScalar(scalar); //Set new vector scalar product object
        /*
        System.out.println("\nVector 1 Scalar Product: \nX: " + vectorScalarProduct.getX() + "\n" + "Y: " + vectorScalarProduct.getY());
        
        System.out.println("\nThe Vector 1 Magnitude is: " + vector1.vectorMagnitude());
        System.out.println("The Vector 2 Magnitude is: " + vector2.vectorMagnitude());
        
        System.out.println("\nThe 2 vector's magnitude are equal: " + vector1.equals(vector2));
        
        
        System.out.println("\nTest toString method: ");
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println(vectorSum);
        System.out.println(vectorProduct);
        */
    }
    
}

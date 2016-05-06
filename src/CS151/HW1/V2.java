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

public class V2 
{
    private double x;
    private double y;
    
    public V2()
    {
        this(0,0);
    }
    
    public V2(double xAxis, double yAxis)
    {
        this.x = xAxis;
        this.y = yAxis;
    }
    
    public void setX(double xSet)
    {
        x = xSet;
    }
    
    public double getX()
    {
        return x;
    }
    
    public void setY(double ySet)
    {
        y = ySet;
    }
    
    public double getY()
    {
        return y;
    }
    
    //Method to add 2 different vectors. vectorToBeAdded is the second vector object
    public V2 addVector(V2 vectorToBeAdded)
    {
        V2 vectorObj = new V2(this.x, this.y); //Copies/instantiate the first vector values into a new object
        vectorObj.x = vectorObj.x + vectorToBeAdded.getX(); //Vector1 x + Vector2 x, 
        vectorObj.y = vectorObj.y + vectorToBeAdded.getY(); //Obtain Y 
        
        return vectorObj;
    } //End addVector
    
    //Method that multiplies 2 vectors together
    public V2 multiplyVector(V2 vectorMultiplier)
    {
        V2 vectorObj = new V2(this.x, this.y);
        vectorObj.x = this.x * vectorMultiplier.getX();
        vectorObj.y = this.y * vectorMultiplier.getY();
        
        return vectorObj;
    } //End mutliplyVector
    
    //Method that multiplies 1 vector and 1 scalar value
    public V2 multiplyScalar(int scalar)
    {
        V2 newVector = new V2(this.x, this.y);
        newVector.x = this.x * scalar;
        newVector.y = this.y * scalar;
        
        return newVector;
    } //End multiplyScalar
    
    //Method that computes the magnitude of a vector
    public double vectorMagnitude()
    {
       
        double magnitude = Math.sqrt((Math.pow(this.x, 2) + Math.pow(this.y, 2)));
        magnitude = Math.round(Math.abs(magnitude) * 100.00) / 100.00; //Magnitude is always positive, rounding to 2 decimal places
        
        return magnitude;
    } //End vectorMagnitude
    
    //Method that checks to see if 2 vector magnitudes are the same
    public boolean equals(V2 other) 
    {
        // TODO add code to actually compare the magnitudes here
        double v1Magnitude = vectorMagnitude(); //Obtain first vector magnitude
        double v2Magnitude = other.vectorMagnitude(); //Obtain second vector magnitude
        
        return v1Magnitude == v2Magnitude;        
    }
    
    @Override
    public String toString()
    {
        return String.format("x = " + this.x + " , y = " + this.y);
    }
}

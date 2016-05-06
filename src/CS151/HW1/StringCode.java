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
import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adjacent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) 
        {
            String newString = blowup(str); //Obtain expanded string using blowup method
            int count = 1; //Start with 1 count for each individual new character
            int longestRun = 0; //Initialize the longest run
            
            for(int i = 0; i < newString.length() - 1; i++)
            {
                char nextChar = newString.charAt(i+1); //Obtains next character
                
                if(newString.charAt(i) == nextChar) //If the next character is the same as the ith character
                {
                    count++; //Add to counter
                }
                else //Else if a new character is present, reset count
                {
                    count = 1;
                }
               
                if(count > longestRun) //Obtain the largest count by comparison
                {
                    longestRun = count;
                }
            } //End for
            
            return longestRun; //Return longest run
	} //End maxRun method

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) 
        {
            StringBuffer buffer = new StringBuffer(); //Buffer that helps create the new string
       
            if(str.length() == 0) //If there's no string, return blank space
            {
                return "";
            }
            else
            {
                //For loop that obtains individual characters of the string and checks to see if it needs blowup
                for(int i = 0; i < str.length(); i++) 
                {
                    char charLookup = str.charAt(i); //Obtains the individual character of the string
                    
                    if((i < str.length() - 1) && Character.isDigit(charLookup)) //While i is less than the string length, and if it's a number
                    {
                        char blowupChar = str.charAt(i+1); //Obtain next character
                        
                        if(!Character.isDigit(blowupChar)) //Checks to make sure that the next character isn't a number
                        {
                            int nTimesExpand = Integer.parseInt(Character.toString(charLookup)); //Changes the number in the String into an int number for the FOR loop
                            
                            //Keep looping until the number of times from the string has been satisfied
                            for(int k = 0; k < nTimesExpand; k++) 
                            {
                                buffer.append(blowupChar); //Append/Combine the "next" character
                            } //End inner for
                        }
                        else
                        {
                            buffer.append(str.charAt(i+1));
                        }
                    } //End outer if
                    else //Else just combine the current string and the next character
                    {
                        buffer.append(charLookup);
                    } //End outer else
                } //End outer for
            }
            return buffer.toString(); 
	} //End blowup method
	
}

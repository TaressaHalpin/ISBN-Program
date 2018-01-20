import java.util.Scanner;

/*
  
 ISBN: INTERNATIONAL STANDARD BOOK NUMBER 
 DIGIT FORMULA: 
 (d1 x 1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11
 
 DESCRIPTION: Program prompts the user to enter the first 9 digits and 
 displays the 10-digit ISBN (including zeros). 
 Read input as an integer. 
 
 */

public class ISBN {

	public static void main(String[] args) 
	{
      //DECLARE SCANNER INPUT 
      Scanner input = new Scanner(System.in);

      //PROMPT USER TO ENTER ISBN 9 DIGIT NUMBER 
      System.out.println("Please enter the ISBN's first nine digits.");

     int isbnNumber = input.nextInt(); 

      //FINDING ISBN NUMBERS 1-9
      //DIGIT 1: 
      int d1 = isbnNumber / 100000000; 
      int  remainderNumber = isbnNumber % 100000000;

       //DIGIT 2: 
       int d2  = remainderNumber / 10000000; 
       remainderNumber %= 10000000;

       //DIGIT 3: 
       int d3 = remainderNumber / 1000000; 
       remainderNumber %= 1000000;

	//DIGIT 4: 
	int d4 = remainderNumber / 100000;
	remainderNumber %= 100000;

	//DIGIT 5: 
	int d5 = remainderNumber / 10000;
	remainderNumber %= 10000;

	//DIGIT 6: 
	int d6 = remainderNumber / 1000;
	remainderNumber %= 1000;

	//DIGIT 7: 
	int d7 = remainderNumber / 100;
	remainderNumber %= 100;

	//DIGIT 8: 
	int d8 = remainderNumber / 10;
	remainderNumber %= 10;

	//DIGIT 9: 
	int d9 = remainderNumber;
	    
	//DIGIT 10: FORMULA 
	   int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
	   + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
	    
	//PRINT OUT 10 DIGIT ISBN NUMBER: 
	System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
	
        //IF ELSE STATEMENT FOR 10 DIGIT NUMBER 
        if (d10 == 10)
        
	System.out.println("X");
        
        else
        
        System.out.println(d10);    

	}
}

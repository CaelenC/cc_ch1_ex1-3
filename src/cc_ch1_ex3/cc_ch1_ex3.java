//HEADER
//Program Name: Chapter 1 Exercise 3
//Author: Caelen Curtiss
//Class: CS160 Fall 2019
//Date: 10/08/2019
//Description: Hello World + understanding common errors
package cc_ch1_ex3;

public class cc_ch1_ex3
{
	public static void main(String[] args)
	//pt. 3
	//Replace "main" with "mian" effect:Main method not found in class cc_ch1_ex3.ch1_ex3, 
	//please define the main method as:
	//public static void main(String[] args)
	//or a JavaFX application class must extend javafx.application.Application
	
	//pt. 4
	//Remove "static" effect:Main method is not static in class cc_ch1_ex3.ch1_ex3,
	//please define the main method as:
	//public static void main(String[] args)
	
	//pt. 5
	//Remove "public" effect:Main method not found in class cc_ch1_ex3.ch1_ex3,
	//please define the main method as:
	//public static void main(String[] args)
	//or a JavaFX application class must extend javafx.application.Application

	{ 	
		//pt. 1
		//Remove open bracket effect: Unresolved compilation problem: 
		//Syntax error on token ")", { expected after this token
		
		System.out.println("Hello World!");
		System.out.println("*The bigger fish arrives*");
		//pt. 6
		//Remove "System" effect:Unresolved compilation problem: 
		//out cannot be resolved
		
		//pt. 7
		//Replace "println" with "Println" effect: Unresolved compilation problem: 
		//The method Println(String) is undefined for the type PrintStream
		
		//pt. 8
		//Replace "println" with "print" effect: Hello World!*The bigger fish arrives*
		//Does not create a new line
		
		//pt. 9a
		//Remove a parentheses effect: Unresolved compilation problem: 
		//Syntax error on token "println", ( expected after this token
		
		//pt. 9b
		//Add an extra parentheses effect:Unresolved compilation problem: 
		//Syntax error on token ")", delete this token
	}
	
} 	
	//pt. 2
	//Remove close bracket effect: Unresolved compilation problem: 
	//Syntax error, insert "}" to complete ClassBody


/* FOOTER
 * 	Hello World!
 * 	*The bigger fish arrives*
 */

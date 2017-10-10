package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Enter Movie Title");
	Scanner keyboard = new Scanner(System.in);
	String title = "";
	title = keyboard.nextLine();
	String answer = title,quit;
	int titleNum = 0;

	String var= "String Value";
	var=  "The title of the movie is" +title+".";

		System.out.print("The title of the movie is" +title+ ".");

	do{
	    System.out.print("Do you want to enter another movie? (Y/Quit)");
    	answer = keyboard.nextLine();
    	if(answer.equalsIgnoreCase("Y")&& !answer.equalsIgnoreCase("Quit")){
    		System.out.println("Enter Movie Title");
    		answer =keyboard.nextLine();
			System.out.print("The title of the movie is" +title+ ".");
		}else{
    		System.out.println("You entered" +titleNum+ "movies.");
		}

    }while(!answer.equalsIgnoreCase("Quit"));
}

}

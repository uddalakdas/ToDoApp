package com.manning.gia.todo.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CommandLineIO{
	private static int noOfTries = 0;
	private static final int MAXNOOfTRIES = 5;
	public final static char EXIT = 'e';
	private static BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	public static char getCommandLineInputOption()throws IOException{
		
		String commandLineInput = buffer.readLine();
		char input=commandLineInput.toLowerCase().charAt(0);
		if(input == 'a' || input == 'f' || input == 'i' || input == 'u' || input == 'd' || input == 'e' )
			return input;
		else{
			noOfTries++;
			if(noOfTries < MAXNOOfTRIES){
				System.out.print("Sorry Wrong input: Try again..");
				displayOptions();
				return getCommandLineInputOption();
			}
			else
				return 'e';
			
				
		}
	}
	public static void displayOptions(){
		System.out.println("Please make a choice:");
		System.out.println("(a)ll items");
		System.out.println("(f)ind a specific item");
		System.out.println("(i)nsert a new item");
		System.out.println("(u)pdate an existing item");
		System.out.println("(d)elete an existing item");
		System.out.println("(e)xit");
		System.out.println(">");
	}
	public static void displayItem(String output){
		System.out.println(output);
	}
	public static String getCommandLineInput()throws IOException{
		return buffer.readLine();
	}
}
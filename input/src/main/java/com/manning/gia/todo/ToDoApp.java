package com.manning.gia.todo;
import com.manning.gia.todo.utils.CommandLineIO;
import com.manning.gia.todo.utils.CommandLineInputHandler;
import java.io.IOException;
public class ToDoApp {
	
	public static void main(String args[])throws IOException {
		CommandLineInputHandler commandLineInputHandler = new CommandLineInputHandler();
		char command;
		while((command=CommandLineIO.getCommandLineInputOption()) != CommandLineIO.EXIT) {
			CommandLineIO.displayOptions();
			CommandLineInputHandler.performActionOn(command);
			
			
			
		}
	}
}
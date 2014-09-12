package com.manning.gia.todo.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CommandLineInput{
	pubic static String getCommandLineInput(){
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String commandLineInput = buffer.readLine();
	}
	public static void displayOptions(){
		System.out.println("Please make a choice:");
		System.out.println("(a)ll items");
		System.out.println("(f)ind a specific item");
		System.out.println("(i)nsert a new item");
		System.out.println("(u)pdate an existing item");
		System.out.println("(d)elete an existing item");
		System.out.println("(e)xit");
	}
}
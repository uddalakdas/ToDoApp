package com.manning.gia.todo.utils;
import com.manning.gia.todo.repository.InMemoryToDoRepository;
import com.manning.gia.todo.model.ToDoItem;
import java.util.List;
import java.io.IOException;
public class CommandLineInputHandler{
	private static InMemoryToDoRepository repository = new InMemoryToDoRepository();
	public static void performActionOn(char command)throws IOException{
		
		switch(command){
			case 'a':
				List<ToDoItem> list=repository.findAll();
				for (ToDoItem item: list){
					CommandLineIO.displayItem("ID: "+item.getId());
					CommandLineIO.displayItem("Name: "+item.getName());
					CommandLineIO.displayItem("Status: "+(item.getCompleted()?"Completed":"Pending"));
					CommandLineIO.displayItem("\n\n");
				}
				break;
			
			case 'i':
				CommandLineIO.displayItem("Enter Name: ");
				ToDoItem item = new ToDoItem();
				item.setName(CommandLineIO.getCommandLineInput());
				repository.insert(item);
				
		}
		
	}
}
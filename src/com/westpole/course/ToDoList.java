package com.westpole.course;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class ToDoList {
	private String topic;
	private HashMap<String,Boolean> tasks;

	public ToDoList(String topic) {
		this.topic = topic;
		this.tasks = new HashMap<String,Boolean>();
	}
	public void addTask(String task) {
		this.tasks.put(task, false);
	}
	public void markAsDone(String task) {
		System.out.println("Marked " + task + " as completed");
		if (this.tasks.containsKey(task)) {
			this.tasks.put(task, true);
		} else {
			System.out.println("no such task");
		}
	}
	public void removeTask(String task) {
		System.out.println("removing " + task);
		if (this.tasks.containsKey(task)) {
			this.tasks.remove(task);
		} else {
			System.out.println("no such task");
		}
	}
	public void rename(String oldTask, String newTask) {
		System.out.println("renaming " + oldTask + " to " + newTask) ;
		if (this.tasks.containsKey(oldTask)) {
			this.tasks.put(newTask, this.tasks.get(oldTask));
			this.tasks.remove(oldTask);
		} else {
			System.out.println("no such task");
		}
	}
	public void display() {
		if (this.tasks.size() == 0) {
			System.out.println("List " + topic + " is empty");
		} else {
			System.out.println("List is: " + topic);
			for (Entry<String,Boolean> task : this.tasks.entrySet()) { 
				if (task.getValue()) {
					System.out.println("Task " + task.getKey() + " is complete ");
				} else {
					System.out.println("Task " + task.getKey() + " is not complete ");
				}
								
			}
		}
	}

}
    
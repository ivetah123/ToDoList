package com.westpole.course;

import java.util.ArrayList;
import java.util.Iterator;

public class ToDoList {
	private String topic;
	private ArrayList<String> tasks;

	public ToDoList(String topic) {
		this.topic = topic;
		this.tasks = new ArrayList<String>();
	}
	public void addTask(String task) {
		this.tasks.add(task);
	}
	public void removeTask(int i) {
		try {
			this.tasks.remove(i);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index doesn't exist");
		}
	}
	public void rename(int i, String newTask) {
		try {
			this.tasks.set(i, newTask);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("no index");
		}
	}
	public void display() {
		if (this.tasks.size() == 0) {
			System.out.println("List " + topic + " is empty");
		} else {
			System.out.println("List is: " + topic);
			for (int i = 0; i < this.tasks.size(); i++) { 
				System.out.println("Task number " + i + " is " + this.tasks.get(i));				
			}
		}
	}

}
 
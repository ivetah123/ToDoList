package com.westpole.course;

public class MorningRoutine {

	public static void main(String[] args) {
		ToDoList myToDoList = new ToDoList("My morning routine");
		myToDoList.addTask("Wake up");
		myToDoList.addTask("Wash teeth");
		myToDoList.addTask("Put on clothes");
		myToDoList.addTask("Take lunch");
		myToDoList.display();
		System.out.println("******************");
		myToDoList.markAsDone("Take lunch");
		myToDoList.display();
		System.out.println("******************");
		myToDoList.removeTask("Wake up");
		myToDoList.display();
		System.out.println("******************");
		myToDoList.rename("Wash teeth","Wash face");
		myToDoList.display();
	}

}

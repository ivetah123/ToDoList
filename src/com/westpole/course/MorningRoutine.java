package com.westpole.course;

public class MorningRoutine {

	public static void main(String[] args) {
		ToDoList myToDoList = new ToDoList("My morning routine");
		myToDoList.addTask("Wake up");
		myToDoList.addTask("Wash teeth");
		myToDoList.addTask("Put on clothes");
		myToDoList.addTask("Take lunch");
		myToDoList.display();
		myToDoList.removeTask(1);
		myToDoList.display();
		myToDoList.rename(1, "wash face");
		myToDoList.display();
	}

}

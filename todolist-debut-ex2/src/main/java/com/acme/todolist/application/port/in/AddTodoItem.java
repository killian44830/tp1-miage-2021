package com.acme.todolist.application.port.in;


import java.util.List;
import com.acme.todolist.domain.TodoItem;

public interface AddTodoItem {
	
	/**
	 * Stocke un nouveau TodoItem
	 * @param item
	 */
	void addTodoItem(TodoItem item);
}
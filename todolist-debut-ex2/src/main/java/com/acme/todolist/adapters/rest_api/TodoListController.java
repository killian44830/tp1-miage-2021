package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
=======
>>>>>>> branch 'master' of https://github.com/killian44830/tp1-miage-2021.git
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acme.todolist.application.port.in.AddTodoItem;
import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.domain.TodoItem;

/**
 * Le controlleur Spring MVC qui expose les endpoints REST
 * 
 * @author bflorat
 *
 */
@RestController
public class TodoListController {
	
	
	private GetTodoItems getTodoItemsQuery;
	// A compléter
	
	
	private AddTodoItem addTodoItemsQuery;
	
	
//	@Inject
//	public TodoListController(GetTodoItems getTodoItemsQuery) {
//		this.getTodoItemsQuery = getTodoItemsQuery;
//	}
	
	@Inject
	public TodoListController(GetTodoItems getTodoItemsQuery, AddTodoItem addTodoItemsQuery) {
		this.getTodoItemsQuery = getTodoItemsQuery;
		this.addTodoItemsQuery = addTodoItemsQuery;
	}
	
//	@Inject
//	public TodoListController(AddTodoItem addTodoItemsQuery) {
//		this.addTodoItemsQuery = addTodoItemsQuery;
//	}
	
	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQuery.getAllTodoItems();
	}
	
	@PostMapping("/todos")
	public void ajouterItem(@RequestBody TodoItem item) {
		this.addTodoItemsQuery.addTodoItem(item);
		
	}
	
	
	// Endpoint de type POST vers "/todos"
	// A compléter
	public void ajouterItem(@RequestBody TodoItem item) {
		// A compléter		
	}
	
	
}

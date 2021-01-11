package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

  public static void main(String[] args) {
    testAddTodoList();
  }

  public static void testShowTodoList(){
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new Todolist("Belajar Java Dasar");
    todoListRepository.data[1] = new Todolist("Belajar Java OOP");
    todoListRepository.data[2] = new Todolist("Belajar Java Standard Classes");

    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.showTodoList();
  }

  public static void testAddTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("Belajar Java Dasar");
    todoListService.addTodoList("Belajar Java OOP");
    todoListService.addTodoList("Belajar Java Standard Classes");

    todoListService.showTodoList();
  }

}

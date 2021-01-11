package test.service;

import entity.Todolist;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

  public static void main(String[] args) {
    testShowTodoList();
  }

  public static void testShowTodoList(){
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new Todolist("Belajar Java Dasar");
    todoListRepository.data[1] = new Todolist("Belajar Java OOP");
    todoListRepository.data[2] = new Todolist("Belajar Java Standard Classes");

    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.showTodoList();
  }

}

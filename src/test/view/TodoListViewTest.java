package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

  public static void main(String[] args) {
    testShowTodoList();
  }

  public static void testShowTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.addTodoList("Belajar Java Dasar");
    todoListService.addTodoList("Belajar Java OOP");
    todoListService.addTodoList("Belajar Java Standard Classes");

    todoListView.showTodoList();
  }
}

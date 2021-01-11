package repository;

import entity.Todolist;

public interface TodoListRepository {

  Todolist[] getAll();

  void add(Todolist todolist);

  void remove(Integer number);

}

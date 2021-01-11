package repository;

import entity.Todolist;

public interface TodoListRepository {

  Todolist[] getAll();

  void add(Todolist todolist);

  boolean remove(Integer number);

}

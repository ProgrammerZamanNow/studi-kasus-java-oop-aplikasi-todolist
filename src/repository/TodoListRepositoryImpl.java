package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository{

  public Todolist[] data = new Todolist[10];

  @Override
  public Todolist[] getAll() {
    return data;
  }

  @Override
  public void add(Todolist todolist) {

  }

  @Override
  public void remove(Integer number) {

  }
}

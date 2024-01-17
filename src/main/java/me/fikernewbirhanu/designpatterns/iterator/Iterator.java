package me.fikernewbirhanu.designpatterns.iterator;

public interface Iterator<T> {
  boolean hasNext();

  void next();

  T current();
}

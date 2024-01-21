package me.fikernewbirhanu.designpatterns.prototype;

public interface Component {
  public void render();

  public Component clone();
}

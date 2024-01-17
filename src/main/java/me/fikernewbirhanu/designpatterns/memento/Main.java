package me.fikernewbirhanu.designpatterns.memento;

public class Main {
  public static void main(String[] args) {
    Editor editor = new Editor();
    editor.setContent("Hello, world!");
    editor.setContent("This is new.");
    editor.setContent("Another world.");
    editor.undo();
    System.out.println(editor.getContent());
    editor.redo();
    System.out.println(editor.getContent());
  }
}

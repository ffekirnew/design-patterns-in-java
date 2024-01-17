package me.fikernewbirhanu.designpatterns.memento;

public class EditorState {
  private final Editor editor;

  public Editor getEditor() {
    return editor;
  }

  EditorState(Editor editor) {
    this.editor = editor;
  }
}

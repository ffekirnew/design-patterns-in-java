package me.fikernewbirhanu.designpatterns.memento;

class HistoryNode {
  private final EditorState state;
  public HistoryNode previousState;
  public HistoryNode nextState;

  HistoryNode(EditorState state) {
    this.state = state;
  }

  EditorState getState() {
    return state;
  }

  void Something() {
  }
}

public class History {
  private HistoryNode head;

  History(EditorState state) {
    head = new HistoryNode(state);
  }

}

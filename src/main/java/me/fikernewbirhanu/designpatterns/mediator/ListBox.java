package me.fikernewbirhanu.designpatterns.mediator;

public class ListBox extends UIControl {
  private String selected;

  public ListBox(DialogueBox owner) {
    super(owner);
  }

  public String getSelected() {
    return selected;
  }

  public void setSelected(String selected) {
    this.selected = selected;
    owner.changed(this);
  }
}

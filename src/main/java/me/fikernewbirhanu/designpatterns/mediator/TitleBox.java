package me.fikernewbirhanu.designpatterns.mediator;

public class TitleBox extends UIControl {
  private String text;

  public TitleBox(DialogueBox owner) {
    super(owner);
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
    owner.changed(this);
  }
}

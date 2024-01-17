package me.fikernewbirhanu.designpatterns.mediator;

public abstract class UIControl {
  protected DialogueBox owner;

  public UIControl(DialogueBox owner) {
    this.owner = owner;
  }
}

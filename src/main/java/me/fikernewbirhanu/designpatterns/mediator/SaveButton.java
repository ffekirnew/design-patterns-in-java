package me.fikernewbirhanu.designpatterns.mediator;

public class SaveButton extends UIControl {
  private boolean disabled;

  public SaveButton(DialogueBox owner) {
    super(owner);
  }

  public boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(boolean disabled) {
    this.disabled = disabled;
    owner.changed(this);
  }
}

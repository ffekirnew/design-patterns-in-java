package me.fikernewbirhanu.designpatterns.mediator;

public class ArticleDialogueBox extends DialogueBox {
  private ListBox listBox;
  private SaveButton saveButton;
  private TitleBox titleBox;

  public ArticleDialogueBox() {
    listBox = new ListBox(this);
    saveButton = new SaveButton(this);
    titleBox = new TitleBox(this);
  }
}

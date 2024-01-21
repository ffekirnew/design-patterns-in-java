package me.fikernewbirhanu.designpatterns.prototype;

public class ContextMenu {
  Component duplicate(Component component) {
    return component.clone();
  }
}

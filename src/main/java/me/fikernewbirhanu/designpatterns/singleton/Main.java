package me.fikernewbirhanu.designpatterns.singleton;

public class Main {
  public static void main() {
    ConfigManager manager = ConfigManager.getInstance();

    manager.setSetting("Fikernew", "Engineer");
    Object value = manager.getSetting("Fikernew");
    System.out.println(value);
  }
}

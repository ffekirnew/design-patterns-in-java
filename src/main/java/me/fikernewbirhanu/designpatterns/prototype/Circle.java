package me.fikernewbirhanu.designpatterns.prototype;

public class Circle implements Component {
  private float radius;

  Circle(float radius) {
    this.radius = radius;
  }

  @Override
  public void render() {
    System.out.println("Rendering a circle.");
  }

  @Override
  public Component clone() {
    Component newCircle = new Circle(this.radius);
    return newCircle;
  }

}

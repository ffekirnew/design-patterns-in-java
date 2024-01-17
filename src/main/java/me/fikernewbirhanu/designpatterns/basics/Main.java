package me.fikernewbirhanu.designpatterns.basics;

public class Main {

}

class Calculator implements TaxCalculator {
  @Override
  public float calculate() {
    throw new UnsupportedOperationException("Unimplemented method 'calculate'");
  }
}

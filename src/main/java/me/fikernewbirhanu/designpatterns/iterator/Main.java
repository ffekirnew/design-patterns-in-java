package me.fikernewbirhanu.designpatterns.iterator;

public class Main {
  public static void main() {
    BrowserHistory history = new BrowserHistory();
    history.visitNew("google.com");
    history.visitNew("facebook.com");
    history.visitNew("twitter.com");

    Iterator<HistoryNode> historyIterator = history.createIterator();
    while (historyIterator.hasNext()) {
      System.out.println(historyIterator.current().getUrl());
      historyIterator.next();
    }
  }
}

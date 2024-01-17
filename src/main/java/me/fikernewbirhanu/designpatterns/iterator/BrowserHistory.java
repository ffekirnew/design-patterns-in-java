package me.fikernewbirhanu.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

class HistoryNode {
  final private String url;
  public HistoryNode next;
  public HistoryNode previous;

  HistoryNode(String url) {
    this.url = url;
    this.next = null;
    this.previous = null;
  }

  public String getUrl() {
    return url;
  }
}

public class BrowserHistory {
  private HistoryNode current;

  BrowserHistory() {
    this.current = null;
  }

  void visitNew(String url) {
    HistoryNode newSite = new HistoryNode(url);
    newSite.next = this.current;
    this.current = newSite;
  }

  List<HistoryNode> getHistory() {
    List<HistoryNode> result = new ArrayList<HistoryNode>();

    HistoryNode current = this.current;
    while (current != null) {
      result.add(current);
      current = current.next;
    }

    return result;
  }

  public HistoryIterator createIterator() {
    return new HistoryIterator(this);
  }

  class HistoryIterator implements Iterator<HistoryNode> {
    private HistoryNode current;

    HistoryIterator(BrowserHistory history) {
      this.current = history.current;
    }

    @Override

    public boolean hasNext() {
      return this.current != null && this.current.next != null;
    }

    @Override
    public void next() {
      this.current = this.current.next;
    }

    @Override
    public HistoryNode current() {
      return this.current;
    }
  }

}


package org.elasticsearch.x_pack.watcher.schedule;

public enum IntervalUnit {
  S("s"),
    M("m"),
    H("h"),
    D("d"),
    W("w");
  private final String textRepresentation;

  private IntervalUnit(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

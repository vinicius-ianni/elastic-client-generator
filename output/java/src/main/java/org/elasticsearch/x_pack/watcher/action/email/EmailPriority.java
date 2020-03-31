
package org.elasticsearch.x_pack.watcher.action.email;

public enum EmailPriority {
  Lowest("lowest"),
    Low("low"),
    Normal("normal"),
    High("high"),
    Highest("highest");
  private final String textRepresentation;

  private EmailPriority(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

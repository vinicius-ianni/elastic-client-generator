
package org.elasticsearch.common;

public enum WaitForEvents {
  Immediate("immediate"),
    Urgent("urgent"),
    High("high"),
    Normal("normal"),
    Low("low"),
    Languid("languid");
  private final String textRepresentation;

  private WaitForEvents(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

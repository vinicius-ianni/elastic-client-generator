
package org.elasticsearch.common;

public enum WaitForStatus {
  Green("green"),
    Yellow("yellow"),
    Red("red");
  private final String textRepresentation;

  private WaitForStatus(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

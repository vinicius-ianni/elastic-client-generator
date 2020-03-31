
package org.elasticsearch.common;

public enum Health {
  Green("green"),
    Yellow("yellow"),
    Red("red");
  private final String textRepresentation;

  private Health(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

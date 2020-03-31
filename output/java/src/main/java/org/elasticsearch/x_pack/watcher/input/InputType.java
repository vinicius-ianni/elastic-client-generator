
package org.elasticsearch.x_pack.watcher.input;

public enum InputType {
  Http("http"),
    Search("search"),
    Simple("simple");
  private final String textRepresentation;

  private InputType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

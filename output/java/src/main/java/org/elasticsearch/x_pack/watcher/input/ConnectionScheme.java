
package org.elasticsearch.x_pack.watcher.input;

public enum ConnectionScheme {
  Http("http"),
    Https("https");
  private final String textRepresentation;

  private ConnectionScheme(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

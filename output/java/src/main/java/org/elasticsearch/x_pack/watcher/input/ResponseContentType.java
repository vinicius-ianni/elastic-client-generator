
package org.elasticsearch.x_pack.watcher.input;

public enum ResponseContentType {
  Json("json"),
    Yaml("yaml"),
    Text("text");
  private final String textRepresentation;

  private ResponseContentType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

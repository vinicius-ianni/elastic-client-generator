
package org.elasticsearch.x_pack.watcher.action.email;

public enum DataAttachmentFormat {
  Json("json"),
    Yaml("yaml");
  private final String textRepresentation;

  private DataAttachmentFormat(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

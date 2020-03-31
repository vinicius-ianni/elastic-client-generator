
package org.elasticsearch.index_modules.index_settings.translog;

public enum TranslogDurability {
  Request("request"),
    Async("async");
  private final String textRepresentation;

  private TranslogDurability(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

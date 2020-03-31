
package org.elasticsearch.analysis.plugins.kuromoji;

public enum KuromojiTokenizationMode {
  Normal("normal"),
    Search("search"),
    Extended("extended");
  private final String textRepresentation;

  private KuromojiTokenizationMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

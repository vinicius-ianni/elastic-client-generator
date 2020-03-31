
package org.elasticsearch.mapping.dynamic_template;

public enum MatchType {
  Simple("simple"),
    Regex("regex");
  private final String textRepresentation;

  private MatchType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

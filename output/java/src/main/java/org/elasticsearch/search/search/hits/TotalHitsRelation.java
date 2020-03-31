
package org.elasticsearch.search.search.hits;

public enum TotalHitsRelation {
  Eq("eq"),
    Gte("gte");
  private final String textRepresentation;

  private TotalHitsRelation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

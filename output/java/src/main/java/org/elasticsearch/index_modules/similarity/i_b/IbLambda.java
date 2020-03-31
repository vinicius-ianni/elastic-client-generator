
package org.elasticsearch.index_modules.similarity.i_b;

public enum IbLambda {
  Df("df"),
    Ttf("ttf");
  private final String textRepresentation;

  private IbLambda(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

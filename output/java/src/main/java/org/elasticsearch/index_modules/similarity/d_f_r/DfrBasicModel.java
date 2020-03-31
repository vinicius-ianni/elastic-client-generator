
package org.elasticsearch.index_modules.similarity.d_f_r;

public enum DfrBasicModel {
  Be("be"),
    D("d"),
    G("g"),
    If("if"),
    In("in"),
    Ine("ine"),
    P("p");
  private final String textRepresentation;

  private DfrBasicModel(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

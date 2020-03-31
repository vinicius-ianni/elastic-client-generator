
package org.elasticsearch.index_modules.similarity.d_f_r;

public enum DfrAfterEffect {
  No("no"),
    B("b"),
    L("l");
  private final String textRepresentation;

  private DfrAfterEffect(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

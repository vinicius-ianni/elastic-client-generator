
package org.elasticsearch.common;

public enum Bytes {
  B("b"),
    K("k"),
    Kb("kb"),
    M("m"),
    Mb("mb"),
    G("g"),
    Gb("gb"),
    T("t"),
    Tb("tb"),
    P("p"),
    Pb("pb");
  private final String textRepresentation;

  private Bytes(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

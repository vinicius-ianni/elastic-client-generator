
package org.elasticsearch.query_dsl.compound.function_score.functions.field_value;

public enum FieldValueFactorModifier {
  None("none"),
    Log("log"),
    Log1p("log1p"),
    Log2p("log2p"),
    Ln("ln"),
    Ln1p("ln1p"),
    Ln2p("ln2p"),
    Square("square"),
    Sqrt("sqrt"),
    Reciprocal("reciprocal");
  private final String textRepresentation;

  private FieldValueFactorModifier(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

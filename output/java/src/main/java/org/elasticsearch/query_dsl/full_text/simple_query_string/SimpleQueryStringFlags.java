
package org.elasticsearch.query_dsl.full_text.simple_query_string;

public enum SimpleQueryStringFlags {
  None("NONE"),
    And("AND"),
    Or("OR"),
    Not("NOT"),
    Prefix("PREFIX"),
    Phrase("PHRASE"),
    Precedence("PRECEDENCE"),
    Escape("ESCAPE"),
    Whitespace("WHITESPACE"),
    Fuzzy("FUZZY"),
    Near("NEAR"),
    Slop("SLOP"),
    All("ALL");
  private final String textRepresentation;

  private SimpleQueryStringFlags(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

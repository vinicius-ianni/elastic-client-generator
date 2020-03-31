
package org.elasticsearch.modules.scripting;

public enum ScriptLang {
  Painless("painless"),
    Expression("expression"),
    Mustache("mustache");
  private final String textRepresentation;

  private ScriptLang(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

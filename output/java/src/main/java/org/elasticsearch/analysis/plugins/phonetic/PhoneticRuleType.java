
package org.elasticsearch.analysis.plugins.phonetic;

public enum PhoneticRuleType {
  Approx("approx"),
    Exact("exact");
  private final String textRepresentation;

  private PhoneticRuleType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

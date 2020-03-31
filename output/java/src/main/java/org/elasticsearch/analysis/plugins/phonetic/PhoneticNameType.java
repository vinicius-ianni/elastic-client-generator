
package org.elasticsearch.analysis.plugins.phonetic;

public enum PhoneticNameType {
  Generic("generic"),
    Ashkenazi("ashkenazi"),
    Sephardic("sephardic");
  private final String textRepresentation;

  private PhoneticNameType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

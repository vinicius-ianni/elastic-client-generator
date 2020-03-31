
package org.elasticsearch.analysis.plugins.phonetic;

public enum PhoneticLanguage {
  Any("any"),
    Comomon("comomon"),
    Cyrillic("cyrillic"),
    English("english"),
    French("french"),
    German("german"),
    Hebrew("hebrew"),
    Hungarian("hungarian"),
    Polish("polish"),
    Romanian("romanian"),
    Russian("russian"),
    Spanish("spanish");
  private final String textRepresentation;

  private PhoneticLanguage(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}


package org.elasticsearch.analysis.languages;

public enum Language {
  Arabic("Arabic"),
    Armenian("Armenian"),
    Basque("Basque"),
    Brazilian("Brazilian"),
    Bulgarian("Bulgarian"),
    Catalan("Catalan"),
    Chinese("Chinese"),
    Cjk("Cjk"),
    Czech("Czech"),
    Danish("Danish"),
    Dutch("Dutch"),
    English("English"),
    Finnish("Finnish"),
    French("French"),
    Galician("Galician"),
    German("German"),
    Greek("Greek"),
    Hindi("Hindi"),
    Hungarian("Hungarian"),
    Indonesian("Indonesian"),
    Irish("Irish"),
    Italian("Italian"),
    Latvian("Latvian"),
    Norwegian("Norwegian"),
    Persian("Persian"),
    Portuguese("Portuguese"),
    Romanian("Romanian"),
    Russian("Russian"),
    Sorani("Sorani"),
    Spanish("Spanish"),
    Swedish("Swedish"),
    Turkish("Turkish"),
    Thai("Thai");
  private final String textRepresentation;

  private Language(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

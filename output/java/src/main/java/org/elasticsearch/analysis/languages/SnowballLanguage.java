
package org.elasticsearch.analysis.languages;

public enum SnowballLanguage {
  Armenian("Armenian"),
    Basque("Basque"),
    Catalan("Catalan"),
    Danish("Danish"),
    Dutch("Dutch"),
    English("English"),
    Finnish("Finnish"),
    French("French"),
    German("German"),
    German2("German2"),
    Hungarian("Hungarian"),
    Italian("Italian"),
    Kp("Kp"),
    Lovins("Lovins"),
    Norwegian("Norwegian"),
    Porter("Porter"),
    Portuguese("Portuguese"),
    Romanian("Romanian"),
    Russian("Russian"),
    Spanish("Spanish"),
    Swedish("Swedish"),
    Turkish("Turkish");
  private final String textRepresentation;

  private SnowballLanguage(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}


package org.elasticsearch.analysis.plugins.phonetic;

public enum PhoneticEncoder {
  Metaphone("metaphone"),
    DoubleMetaphone("double_metaphone"),
    Soundex("soundex"),
    RefinedSoundex("refined_soundex"),
    Caverphone1("caverphone1"),
    Caverphone2("caverphone2"),
    Cologne("cologne"),
    Nysiis("nysiis"),
    Koelnerphonetik("koelnerphonetik"),
    Haasephonetik("haasephonetik"),
    BeiderMorse("beider_morse"),
    DaitchMokotoff("daitch_mokotoff");
  private final String textRepresentation;

  private PhoneticEncoder(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

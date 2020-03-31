
package org.elasticsearch.analysis.plugins.icu.normalization;

public enum IcuNormalizationType {
  Nfc("nfc"),
    Nfkc("nfkc"),
    NfkcCf("nfkc_cf");
  private final String textRepresentation;

  private IcuNormalizationType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}


package org.elasticsearch.index_modules.index_settings.settings;

public enum RecoveryInitialShards {
  Quorem("quorem"),
    Quorem_1("quorem-1"),
    Full("full"),
    Full_1("full-1");
  private final String textRepresentation;

  private RecoveryInitialShards(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

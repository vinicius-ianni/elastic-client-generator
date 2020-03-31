
package org.elasticsearch.x_pack.migration.deprecation_info;

public enum DeprecationWarningLevel {
  None("none"),
    Info("info"),
    Warning("warning"),
    Critical("critical");
  private final String textRepresentation;

  private DeprecationWarningLevel(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}


package org.elasticsearch.common;

public enum VersionType {
  Internal("internal"),
    External("external"),
    ExternalGte("external_gte"),
    Force("force");
  private final String textRepresentation;

  private VersionType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

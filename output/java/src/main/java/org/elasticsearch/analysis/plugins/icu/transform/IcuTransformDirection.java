
package org.elasticsearch.analysis.plugins.icu.transform;

public enum IcuTransformDirection {
  Forward("forward"),
    Reverse("reverse");
  private final String textRepresentation;

  private IcuTransformDirection(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

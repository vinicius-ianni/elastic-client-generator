
package org.elasticsearch.modules.indices.fielddata.numeric;

public enum NumericFielddataFormat {
  Array("array"),
    Disabled("disabled");
  private final String textRepresentation;

  private NumericFielddataFormat(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

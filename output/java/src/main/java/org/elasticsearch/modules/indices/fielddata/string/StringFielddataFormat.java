
package org.elasticsearch.modules.indices.fielddata.string;

public enum StringFielddataFormat {
  PagedBytes("paged_bytes"),
    Disabled("disabled");
  private final String textRepresentation;

  private StringFielddataFormat(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

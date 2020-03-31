
package org.elasticsearch.modules.indices.fielddata.geo_point;

public enum GeoPointFielddataFormat {
  Array("array"),
    DocValues("doc_values"),
    Compressed("compressed"),
    Disabled("disabled");
  private final String textRepresentation;

  private GeoPointFielddataFormat(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

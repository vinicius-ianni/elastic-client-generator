
package org.elasticsearch.aggregations.bucket.geo_tile_grid;

public enum GeoTilePrecision {
  Precision0("Precision0"),
    Precision1("Precision1"),
    Precision2("Precision2"),
    Precision3("Precision3"),
    Precision4("Precision4"),
    Precision5("Precision5"),
    Precision6("Precision6"),
    Precision7("Precision7"),
    Precision8("Precision8"),
    Precision9("Precision9"),
    Precision10("Precision10"),
    Precision11("Precision11"),
    Precision12("Precision12"),
    Precision13("Precision13"),
    Precision14("Precision14"),
    Precision15("Precision15"),
    Precision16("Precision16"),
    Precision17("Precision17"),
    Precision18("Precision18"),
    Precision19("Precision19"),
    Precision20("Precision20"),
    Precision21("Precision21"),
    Precision22("Precision22"),
    Precision23("Precision23"),
    Precision24("Precision24"),
    Precision25("Precision25"),
    Precision26("Precision26"),
    Precision27("Precision27"),
    Precision28("Precision28"),
    Precision29("Precision29");
  private final String textRepresentation;

  private GeoTilePrecision(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

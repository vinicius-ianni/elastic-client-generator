
package org.elasticsearch.modules.indices.fielddata;

public enum FielddataLoading {
  Eager("eager"),
    EagerGlobalOrdinals("eager_global_ordinals");
  private final String textRepresentation;

  private FielddataLoading(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

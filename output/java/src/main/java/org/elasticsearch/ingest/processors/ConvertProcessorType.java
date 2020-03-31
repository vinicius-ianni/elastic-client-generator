
package org.elasticsearch.ingest.processors;

public enum ConvertProcessorType {
  Integer("integer"),
    Long("long"),
    Float("float"),
    Double("double"),
    String("string"),
    Boolean("boolean"),
    Auto("auto");
  private final String textRepresentation;

  private ConvertProcessorType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

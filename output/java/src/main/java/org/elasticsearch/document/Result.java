
package org.elasticsearch.document;

public enum Result {
  Error("Error"),
    Created("created"),
    Updated("updated"),
    Deleted("deleted"),
    NotFound("not_found"),
    Noop("noop");
  private final String textRepresentation;

  private Result(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

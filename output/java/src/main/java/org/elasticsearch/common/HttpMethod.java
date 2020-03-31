
package org.elasticsearch.common;

public enum HttpMethod {
  Get("GET"),
    Post("POST"),
    Put("PUT"),
    Delete("DELETE"),
    Head("HEAD");
  private final String textRepresentation;

  private HttpMethod(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

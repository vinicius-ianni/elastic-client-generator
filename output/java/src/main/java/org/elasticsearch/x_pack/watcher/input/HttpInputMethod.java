
package org.elasticsearch.x_pack.watcher.input;

public enum HttpInputMethod {
  Head("head"),
    Get("get"),
    Post("post"),
    Put("put"),
    Delete("delete");
  private final String textRepresentation;

  private HttpInputMethod(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

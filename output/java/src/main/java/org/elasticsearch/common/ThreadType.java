
package org.elasticsearch.common;

public enum ThreadType {
  Cpu("cpu"),
    Wait("wait"),
    Block("block");
  private final String textRepresentation;

  private ThreadType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

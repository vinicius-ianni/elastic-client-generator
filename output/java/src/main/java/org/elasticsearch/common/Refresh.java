
package org.elasticsearch.common;

public enum Refresh {
  True("true"),
    False("false"),
    WaitFor("wait_for");
  private final String textRepresentation;

  private Refresh(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}


package org.elasticsearch.common_options.date_math;

public enum DateMathOperation {
  Add("+"),
    Subtract("-");
  private final String textRepresentation;

  private DateMathOperation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

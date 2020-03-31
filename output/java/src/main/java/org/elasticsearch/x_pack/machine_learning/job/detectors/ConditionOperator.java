
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum ConditionOperator {
  Gt("gt"),
    Gte("gte"),
    Lt("lt"),
    Lte("lte");
  private final String textRepresentation;

  private ConditionOperator(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

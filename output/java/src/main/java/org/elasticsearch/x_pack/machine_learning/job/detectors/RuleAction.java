
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum RuleAction {
  SkipResult("skip_result"),
    SkipModelUpdate("skip_model_update");
  private final String textRepresentation;

  private RuleAction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

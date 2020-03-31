
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum RuleFilterType {
  Include("include"),
    Exclude("exclude");
  private final String textRepresentation;

  private RuleFilterType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

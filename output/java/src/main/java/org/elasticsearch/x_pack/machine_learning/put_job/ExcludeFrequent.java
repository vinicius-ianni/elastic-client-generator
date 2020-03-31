
package org.elasticsearch.x_pack.machine_learning.put_job;

public enum ExcludeFrequent {
  All("all"),
    None("none"),
    By("by"),
    Over("over");
  private final String textRepresentation;

  private ExcludeFrequent(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

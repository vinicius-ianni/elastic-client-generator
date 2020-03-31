
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum InfoContentFunction {
  InfoContent("InfoContent"),
    HighInfoContent("HighInfoContent"),
    LowInfoContent("LowInfoContent");
  private final String textRepresentation;

  private InfoContentFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

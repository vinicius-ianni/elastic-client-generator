
package org.elasticsearch.x_pack.machine_learning.datafeed;

public enum ChunkingMode {
  Auto("auto"),
    Manual("manual"),
    Off("off");
  private final String textRepresentation;

  private ChunkingMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

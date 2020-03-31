
package org.elasticsearch.x_pack.machine_learning.job.config;

public enum MemoryStatus {
  Ok("ok"),
    SoftLimit("soft_limit"),
    HardLimit("hard_limit");
  private final String textRepresentation;

  private MemoryStatus(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

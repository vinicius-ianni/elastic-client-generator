
package org.elasticsearch.cluster.cluster_allocation_explain;

public enum StoreCopy {
  None("NONE"),
    Available("AVAILABLE"),
    Corrupt("CORRUPT"),
    IoError("IO_ERROR"),
    Stale("STALE"),
    Unknown("UNKNOWN");
  private final String textRepresentation;

  private StoreCopy(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}


package org.elasticsearch.x_pack.watcher.execution;

public enum Status {
  Success("success"),
    Failure("failure"),
    Simulated("simulated"),
    Throttled("throttled");
  private final String textRepresentation;

  private Status(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

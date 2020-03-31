
package org.elasticsearch.common;

public enum PipelineFailure {
  BadAuthentication("BadAuthentication"),
    BadResponse("BadResponse"),
    PingFailure("PingFailure"),
    SniffFailure("SniffFailure"),
    CouldNotStartSniffOnStartup("CouldNotStartSniffOnStartup"),
    MaxTimeoutReached("MaxTimeoutReached"),
    MaxRetriesReached("MaxRetriesReached"),
    Unexpected("Unexpected"),
    BadRequest("BadRequest"),
    NoNodesAttempted("NoNodesAttempted");
  private final String textRepresentation;

  private PipelineFailure(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

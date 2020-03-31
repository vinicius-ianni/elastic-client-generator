
package org.elasticsearch.ingest.processors.plugins.user_agent;

public enum UserAgentProperty {
  Name("NAME"),
    Major("MAJOR"),
    Minor("MINOR"),
    Patch("PATCH"),
    Os("OS"),
    OsName("OS_NAME"),
    OsMajor("OS_MAJOR"),
    OsMinor("OS_MINOR"),
    Device("DEVICE"),
    Build("BUILD");
  private final String textRepresentation;

  private UserAgentProperty(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

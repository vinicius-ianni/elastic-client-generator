
package org.elasticsearch.index_modules.index_settings.slow_log;

public enum LogLevel {
  Error("error"),
    Warn("warn"),
    Info("info"),
    Debug("debug"),
    Trace("trace");
  private final String textRepresentation;

  private LogLevel(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}


package org.elasticsearch.x_pack.watcher.action;

public enum ActionType {
  Email("email"),
    Webhook("webhook"),
    Index("index"),
    Logging("logging"),
    Slack("slack"),
    Pagerduty("pagerduty");
  private final String textRepresentation;

  private ActionType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

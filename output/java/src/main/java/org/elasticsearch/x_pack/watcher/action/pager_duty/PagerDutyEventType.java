
package org.elasticsearch.x_pack.watcher.action.pager_duty;

public enum PagerDutyEventType {
  Trigger("trigger"),
    Resolve("resolve"),
    Acknowledge("acknowledge");
  private final String textRepresentation;

  private PagerDutyEventType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

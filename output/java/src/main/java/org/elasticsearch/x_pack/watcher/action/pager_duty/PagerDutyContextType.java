
package org.elasticsearch.x_pack.watcher.action.pager_duty;

public enum PagerDutyContextType {
  Link("link"),
    Image("image");
  private final String textRepresentation;

  private PagerDutyContextType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

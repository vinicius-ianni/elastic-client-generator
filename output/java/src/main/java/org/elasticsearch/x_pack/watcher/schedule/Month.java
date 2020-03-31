
package org.elasticsearch.x_pack.watcher.schedule;

public enum Month {
  January("january"),
    February("february"),
    March("march"),
    April("april"),
    May("may"),
    June("june"),
    July("july"),
    August("august"),
    September("september"),
    October("october"),
    November("november"),
    December("december");
  private final String textRepresentation;

  private Month(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

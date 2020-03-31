
package org.elasticsearch.x_pack.watcher.schedule;

public enum Day {
  Sunday("sunday"),
    Monday("monday"),
    Tuesday("tuesday"),
    Wednesday("wednesday"),
    Thursday("thursday"),
    Friday("friday"),
    Saturday("saturday");
  private final String textRepresentation;

  private Day(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}

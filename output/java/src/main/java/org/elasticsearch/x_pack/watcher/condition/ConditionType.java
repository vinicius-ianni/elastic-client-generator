
package org.elasticsearch.x_pack.watcher.condition;

public enum ConditionType {
  Always("always"),
    Never("never"),
    Script("script"),
    Compare("compare"),
    ArrayCompare("array_compare");
  private final String textRepresentation;

  private ConditionType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
